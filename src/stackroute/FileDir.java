package stackroute;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileDir {
	 public static void main(String[] args) {
	      File file = null;
	      String[] paths;
	      FileReader in = null;
	      Scanner sc = new Scanner(System.in);
	      try {      
	         // create new file object
	         file = new File("data/");

	         // array of files and directory
	         paths = file.list();

	         // for each name in the path array
	         for(String path:paths) {
	            // prints filename and directory name
	            System.out.println(path);
	         }
	         System.out.println("enter full file name to read");
	         String name = sc.nextLine();
	         in = new FileReader("data/"+name);
	         int c;
	         while ((c = in.read()) != -1) {
	            System.out.print(c);
	         }
	         
	      } catch (Exception e) {
	         // if any error occurs
	         e.printStackTrace();
	      }
	   }
	 }
