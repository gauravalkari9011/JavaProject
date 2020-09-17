package String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class numberofWordsinFile {

	public static void main(String[] args) throws IOException {
	  int count = 0;
	  String line;
	
		FileReader file = new FileReader("C:/Users/Gourav A/Desktop/Data/Test Data file/Data.txt");  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split("");  
            //Counts each word  
            count = count + words.length;  
	}
        System.out.println("Number of words present in given file: " + count);  
        br.close();
	}
}