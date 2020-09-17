package FileInputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class RenameFile {

	public static void main(String[] args) throws IOException {

		Random rd= new Random();
		int val= rd.nextInt(50);
		
		File f= new File("C:\\Users\\Gourav A\\Desktop\\Oldgaurav"+val+".txt");
		f.createNewFile();
		File f1= new File("C:\\Users\\Gourav A\\Desktop\\Newgaurav"+val+".txt");
		
		  if(f.exists()) {
			  f.renameTo(f1); // boolean 
		if(f!=f1) {
			System.out.println("Both files are not same after renamed");
			}
		else System.out.println("Both files are same after renamed");
		}
		  else System.out.println("File not found");
	}

}
