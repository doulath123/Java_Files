//Task4: Write a Java program to check if a file or directory has read and write permission.

package tasks_1_10;
import java.io.File;

public class ex4 {
	public static void main(String[] args) {
		File file_path=new File("C:/Users/N.S.DOULATH/Desktop/test.txt");
		if(file_path.canWrite())
		{
			System.out.println(file_path.getAbsolutePath()+"  can write.\n");
		}
		else
		{
			System.out.println(file_path.getAbsolutePath()+" cannot write.\n");
		}
		if(file_path.canRead()) {
			System.out.println(file_path.getAbsolutePath()+"  can read.\n");
		}
		else
		{
			System.out.println(file_path.getAbsolutePath()+"  cannot read.\n");
		}
	}

}
