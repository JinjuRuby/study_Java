/*
import java.io.*;

public class Encrypt {

	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("konkuk.txt");
			FileWriter fout = new FileWriter("konkuk.txt");
			
			int c;
			while((c=fin.read()) != -1) {
				if(Character.isUpperCase(c)) {
					c +=3;
					if(!Character.isUpperCase(c))
						c-=26;
				}
				
				if(Character.isLowerCase(c)) {
					c +=3;
					if(!Character.isLowerCase(c))
						c-=26;
				}
				fout.write(c);
			}
			
			
			
			fin.close();
			fout.close();
		}
		catch(IOException e) {
			System.err.println("IO error");
			
		}
		
	}

}
*/