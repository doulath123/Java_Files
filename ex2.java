//Task2: Write a Java program to get specific files by extensions from a specified folder.

package tasks_1_10;
import java.io.File;
import java.io.FilenameFilter;

public class ex2 {
	public static void main(String arg[]) {
		File file=new File("F:/Desktop");
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.toLowerCase().endsWith(".txt")) {
					return true;
				}else {
					return false;
				}
			}
		});
		for(String f:list) {
			System.out.println(f);
		}
		
	}

}
