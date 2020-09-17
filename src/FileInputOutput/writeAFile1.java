package FileInputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeAFile1 {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw=null;
		
		
		File file = new File("C:\\Users\\Gourav A\\Desktop\\test1.txt");
		file.createNewFile();
		
		if(file.exists()) {
			
			  FileWriter fw = new FileWriter(file);
			  bw = new BufferedWriter(fw);
			  
			  bw.write("This is my first file");
			  
			  System.out.println("Data is appeded in the file");
			  
			  if(bw!=null)
				  bw.close();  
		}
		else System.out.println("File not found");
	}
}
