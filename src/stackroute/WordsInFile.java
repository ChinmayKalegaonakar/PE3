package stackroute;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class WordsInFile {
	public static void main(String args[]) {
		readFile();
	}
	public static void readFile() {
		  
	    Scanner sc;
		try {
			File file = new File("data/FileDemo.txt"); 
			sc = new Scanner(file);
			SortedMap<String, Integer> sm = new TreeMap<String, Integer>();
			while (sc.hasNextLine()) {
				String s = sc.nextLine().toLowerCase();
				
				String[] words = s.split(" ");
				for(String word:words) {
					if(sm.containsKey(word))
						sm.put(word, sm.get(word)+1);
					else
						sm.put(word, 1);
				}
				  // Using iterator in SortedMap 
				Set smi = sm.entrySet();
		        Iterator i = smi.iterator(); 
		  
		        // Traversing map. Note that the traversal 
		        // produced sorted (by keys) output . 
		        while (i.hasNext()) 
		        { 
		            Map.Entry m = (Map.Entry)i.next(); 
		  
		            String key = (String)m.getKey(); 
		            int value = (Integer)m.getValue(); 
		  
		            System.out.println("Word : " + key + 
		                            "  occurence: " + value+" times "); 
		        } 
			      
			    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
}
}
