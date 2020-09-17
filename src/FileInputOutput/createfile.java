package FileInputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class createfile {

	public static void main(String[] args) {

		// Delete the file before executing the create file code
		
		//To avoid delete file again and again time is appended with File name
		Date d= new Date();
		int val= (int) d.getTime();
		
		
		try { 
		File file= new File("C:\\Users\\Gourav A\\Desktop\\gaurav"+val+".txt"); // path with time (it creates empty file)
		boolean v= file.createNewFile();
	
		if(v) 
			System.out.println("File is created");
		else 
			System.out.println("File not created");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
