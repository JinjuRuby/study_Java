/*
import java.util.*;
import java.io.*;

public class EX10_5_1 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("konkuk.txt");
			
			int a;
			char b;
			
			while ((a = fr.read()) != -1) {
			b = (char)a;
				if(b>='a' && b<='z') { //소문자
				if(b+3 > 'z') {
					b = (char)(b-26+3);
				}else {
					b = (char)(b+3);
				}
			}else if(b>='A' && b<='Z') { //대문자
				if(b+3 > 'Z') {
					b = (char)(b-26+3);
				}else {
					b = (char)(b+3);
				}
			}
				   System.out.print(b);
			}
															
	        fr.close();
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