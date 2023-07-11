/*
import java.util.*;
import java.io.*;

public class Ex10_3 {

	public static void main(String[] args) {
		
		String n;
		try {
			Scanner input = new Scanner(new File("konkuk.txt"));
			while(input.hasNext()) {
				n=input.nextLine();
					//System.out.println(new sTringBuffer~~);
				for(int i=n.length()-1;i>=0;i--)
					System.out.print(n.charAt(i));
				System.out.println();
			}
			
			input.close();
		}
		catch (IOException e) {
			System.err.println("cannot open");
			System.exit(1);
		}

	}

}
*/