/*
import java.util.*;

public class ThreadInterruptTest3 {

	public static void main(String[] args) {
		MyThread3 th = new MyThread3();
		th.start();
		for(int i=0;i<5;i++) {
			new Scanner(System.in).nextLine();
			th.interrupt();
		}
	}
}

class MyThread3 extends Thread {
	int n = 0;
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
//			try {
//				sleep(1000);
//			}
//			catch(InterruptedException e) {
//				System.out.println("Interrupted");
//				n = 0;
//			}
		}
	}
}
*/