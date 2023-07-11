/*
import java.util.*;
import java.io.*;

public class Ex10_2 {

	public static void main(String[] args) {

		try {
			Formatter output = new Formatter("mtable.txt");
			for(int i=2;i<10;i++) {
				for(int j=1;j<10;j++)
				{
					output.format("%d x %d = %d\r\n", i, j, i*j);
				}
				output.format("\r\n");
			}
			output.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("cannot open");
			System.exit(1);
		}

	}

}
*/