package FileInputOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;


public class CopyFile {

	public static void main(String[] args) throws IOException {
		
		Random rd= new Random();
		int val= rd.nextInt(50);
		
		File source = new File ("C:\\Users\\Gourav A\\Desktop\\Other Projects\\destgaurav0111111"+val+".txt");
        source.createNewFile();
        File dest = new File ("C:\\Users\\Gourav A");
        
        Files.copy(source.toPath(), dest.toPath());
        com.google.common.io.Files.copy(source, dest);
	}

}
