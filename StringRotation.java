import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		
		System.out.println("������ �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		
		String[] sp = s.split("");
		
		for(int i=1;i<=s.length();i++)
		{
			sb.append(sp[i-1]);
			System.out.println(sb.substring(i) );
		}
		
	}

}