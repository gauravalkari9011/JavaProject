package FileInputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class DeleteFile {

	public static void main(String[] args) {
		
		Random rd= new Random();
		int val=rd.nextInt(50);
		
		File f= new File("C:\\Users\\Gourav A\\Desktop\\DeleteFile"+val+".txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("File is not created");
			e.printStackTrace();
		}
		if (f.exists()) {
			f.delete();
		System.out.println("Deleted File :"+f.getName());
		}
		else System.out.println("File is not found");
		
	}

}
