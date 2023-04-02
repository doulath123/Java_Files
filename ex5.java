//Task5: Write a Java program to check if given pathname is a directory or a file.

package tasks_1_10;

import java.io.File;

public class ex5 {
	public static void main(String[] args) {
		File file_path=new File("C:/Users/N.S.DOULATH/Desktop/test.txt");
		if(file_path.isDirectory())
		{
			System.out.println(file_path.getAbsolutePath()+"   is a directory.");
			
		}
		else
		{
			System.out.println(file_path.getAbsolutePath()+"   is not a directory.");
		}
		
		if(file_path.isFile())
		{
			System.out.println(file_path.getAbsolutePath()+"   is a file.");
		}
		else
		{
			System.out.println(file_path.getAbsolutePath()+"  is not a file.");
		}
	}

}
