/*
import java.io.*;

public class WriteStudent {

	public static void main(String[] args) {
		// 홀길동 2020001 010-1111-1111		임꺽정 2020002 010-2222-2222		이순신 2020003 010-3333-3333
		Student s1 = new Student("홍길동", 2020001, "010-1111-1111");
		Student s2 = new Student("임꺽정", 2020002, "010-2222-2222");
		Student s3 = new Student("이순신", 2020003, "010-3333-3333");
		
		try{
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("student.out") );
			
			output.writeObject(s1);
			output.writeObject(s2);
			output.writeObject(s3);
			output.close();
		}
		catch (IOException e) {
			System.err.println("IO error");
		}

		
		
	}

}
*/