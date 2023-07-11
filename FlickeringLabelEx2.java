/*
import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay, number;
	
	public FlickeringLabel(String text, long delay, long number) {
		super(text);
		this.delay = delay;
		this.number = number;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		while(true) {
			if(number == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if( number ==0) number=1;
			else number = 0;
			try {
				Thread.sleep(delay);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
	
}

public class FlickeringLabelEx2 extends JFrame {
	public FlickeringLabelEx2() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		FlickeringLabel fLabel = new FlickeringLabel("건국대학교", 1000, 0);


		FlickeringLabel fLabel2 = new FlickeringLabel("소프트웨어전공", 1000, 1);
				
		c.add(fLabel);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new FlickeringLabelEx2();
		
		
	}

}
*/