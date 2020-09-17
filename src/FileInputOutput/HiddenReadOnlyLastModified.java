package FileInputOutput;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class HiddenReadOnlyLastModified {

	public static void main(String[] args) throws IOException {
		
		Random rd= new Random();
		int val= rd.nextInt(50);
		
		// Hidden 
		File f = new File ("C:\\Users\\Gourav A\\Desktop\\Hiddengaurav"+val+".txt");
		f.createNewFile();
        boolean b=f.isHidden();
        if(b) System.out.println(f +"File is hidden");
        else System.out.println(f +"File is not hidden");
        
        // ReadOnly 
		File f1 = new File ("C:\\Users\\Gourav A\\Desktop\\Readonlygaurav"+val+".txt");
        f1.createNewFile();
		boolean b1=f1.setReadOnly();
        if(b1)System.out.println(f1 +"File is readonly");
        else System.out.println(f +"File is not readonly");
        
       // File Last modified
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        
        System.out.println(sdf.format(f.lastModified()));
        System.out.println(sdf.format(f1.lastModified()));
        
        
	}
	
	

}
