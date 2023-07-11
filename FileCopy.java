/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		
		
		try  {
		FileInputStream fin =  new FileInputStream("c:\\Temp\\hangul.txt");
		FileOutputStream fout = new FileOutputStream("c:\\Temp\\h.txt");
		
		int ch;
		char c;
        while ((ch = fin.read()) != -1) {
        	fout.write((char) ch);
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