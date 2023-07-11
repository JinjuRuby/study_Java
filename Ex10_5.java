/*
import java.util.*;
import java.io.*;

public class Ex10_5 {

	public static void main(String[] args) {
		
		try {
			FileReader fin = new FileReader("konkuk.txt");
			
			int ch;
			char c;
	        while ((ch = fin.read()) != -1) {
	        		c = (char)ch;
	        	 if(Character.isLowerCase(c)) {
                     c = (char)((ch - 'a' + 3) % 26 + 'a');
                 } else if(Character.isUpperCase(c)) {
                     c = (char) ((ch - 'A' + 3) % 26 + 'A');
                 }
               System.out.print(c);
	        }
			
	        fin.close();
		}
		
		catch (FileNotFoundException e) {
			System.out.println("파일오픈 오류");
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
	}

}
*/