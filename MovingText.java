/*
import java.awt.*;
import javax.swing.*;

class AnthemThread extends Thread {
	private JLabel anthemLabel;
	
	public AnthemThread(JLabel anthemLabel) {
		this.anthemLabel = anthemLabel;
	}
	
	@Override
	public void run() {
		String anthem = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세"
				+"남산 위에 저 소나무 철갑을 두른 듯바람 서리 불변함은 우리 기상일세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세"
				+"가을 하늘 공활한데 높고 구름 없이 밝은 달은 우리 가슴 일편단심일세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세"
				+"이 기상과 이 맘으로 충성을 다하여 괴로우나 즐거우나 나라 사랑하세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세";
		
			
			for(int i=0;i<anthem.length()-19;i++) {
				anthemLabel.setText(anthem.substring(i,i+20));
					try {
						sleep(1000);
					}
				catch(InterruptedException e) {
					return;
				}
					
			}
			
	}
}

public class MovingText extends JFrame {
	
	public MovingText() {
		setTitle("Moving Text");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout() );
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 50) );
		c.add(timerLabel);
		
		setSize(1000, 170);
		setVisible(true);
		
		AnthemThread th = new AnthemThread(timerLabel);
		th.start();
	}
	
	public static void main(String[] args) {
		
		new MovingText();

	}

}
*/