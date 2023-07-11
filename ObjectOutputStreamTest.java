/*
오류난다
import java.io.*;

public class ObjectOutputStreamTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", "111-111");
		Employee e2 = new Employee("Susan", "222-222");
		Employee e3 = new Employee("Bob", "333-333");
		int[] arr = {100,200,300,400};
		
		try {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("employee.txt")); 	
			
			output.writeObject(e1);
			output.writeObject(e2);
			output.writeObject(e3);
			output.writeObject(arr);
			output.close();
			
		}
		catch (IOException e) {
			System.err.println("IO error");
		}
		

	}

}
*/