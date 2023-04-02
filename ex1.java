//Task1: Write a Java program to get a list of all file/directory names from the given specified folder.

package tasks_1_10;

import java.io.File;

public class ex1 {
	public static void main(String arg[]) {
		File file=new File("F:/Desktop");
		String[] fileList=file.list();
		for(String name:fileList) {
			System.out.println(name);
		}
		
	}

}
