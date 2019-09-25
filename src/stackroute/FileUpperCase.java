package stackroute;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileUpperCase {
	public static void main(String args[]) {
		readFile();
	}
	public static void readFile() {
	  
		    Scanner sc;
			try {
				File file = new File("data/file.txt"); 
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
				      System.out.println(sc.nextLine().toUpperCase());
				    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		    
	}
}
