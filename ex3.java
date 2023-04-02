//Task3: Write a Java program to check if a file or directory specified by pathname exists or not.


package tasks_1_10;
import java.io.File;

public class ex3 {
public static void main(String args[]) {
	
	File file_path=new File("c:/Users/N.S.DOULATH/Desktop");
	if(file_path.exists())
	{
		System.out.println("The directory or file exists.\\n");
	}
	else
	{
		System.out.println("The directory or file does not exist.\\n");
	}
	
}
}
