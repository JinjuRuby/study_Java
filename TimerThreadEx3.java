/*
public class TimerThreadEx3 {

	public static void main(String[] args) {
		TimerThread3 th = new TimerThread3();
		th.start();
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			return;
		}
		th.finish(); // TimerThread 강제 종료
		
	}

}

class TimerThread3 extends Thread {
	private int n =0;
	private boolean flag = false; // false로 초기화
	public void finish() {flag = true; }
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n); // 화면에 카운트 값 출력
			n++;
			try {
				sleep(1000);
				if(flag == true)
					return; // 스레드 종료
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
	}
	
	
	
}
*/