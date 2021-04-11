package ex04;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class MyMouseListener implements MouseListener{

	int num = 1;
	int count = 3;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		JLabel label = (JLabel)obj;
		String text = label.getText();
		
		if (Integer.parseInt(text) == num) {
			label.setVisible(false);
			num++;
			//System.out.println("정답");
			if(num > 10) {
				System.out.println("성공!");
			} 
			
		} else {
			System.out.println("틀림");
			count--;
			if(count < 1) {
				System.out.println("게임 종료....");
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
