/*
import java.awt.*;
import javax.swing.*;

class StopwatchThread extends Thread {
	private JLabel label;
	private int intval;
	
	public StopwatchThread(JLabel label, int intval) {
		this.label = label;
		this.intval = intval;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			label.setText(Integer.toString(n)+".");
			n++;
			if(n==60)	n = 0;
			try {
				sleep(intval);
				
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
	
}

public class Stopwatch extends JFrame {
	public Stopwatch() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout() );
		
		JLabel label1 = new JLabel();
		label1.setFont(new Font("Gothic", Font.ITALIC, 80) );
		c.add(label1);
		
		JLabel label2 = new JLabel();
		label2.setFont(new Font("Gothic", Font.ITALIC, 80) );
		c.add(label2);
		
		setSize(300, 170);
		setVisible(true);
		
		StopwatchThread th1 = new StopwatchThread(label1, 1000);
		th1.start();
		
		StopwatchThread th2 = new StopwatchThread(label2, 100);
		th2.start();
	}
	
	public static void main(String[] args) {
		
		new Stopwatch();

	}

}
*/