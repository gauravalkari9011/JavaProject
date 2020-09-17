package FileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadAFile {

	public static void main(String[] args) throws IOException {

		BufferedReader br=null;
		
		File f= new File("C:\\Users\\Gourav A\\Desktop\\test1.txt"); 
		if(f.exists()) {
		
		br= new BufferedReader(new FileReader(f));	
		String text= br.readLine();
		if (text!=null)
			System.out.println(text);
		 		else System.out.println("File is empty");
		if (br != null)
			 br.close();
		}
		else System.out.println("File is not created yet");
		
	}

}
