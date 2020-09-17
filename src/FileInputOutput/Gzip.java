package FileInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Gzip {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		byte[] buffer = new byte[1024];
		GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("C:\\Users\\Gourav A\\Desktop\\test.gz"));
			 		
	File fis = new File("C:\\Users\\Gourav A\\Desktop\\Myfile.txt");
			 fis.createNewFile();
	//Reading from input file and writing to output GZip file
	     boolean length;
	  // while ((length = fis.canWrite())>0) {
	//	   gos.write(buffer, 0, length);		   
	   }
	}
//}

