package ex03;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Å¬¸¯µÊ");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Object obj = e.getSource();
		JButton btn = (JButton)obj;
		btn.setBackground(Color.PINK);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		JButton btn = (JButton)obj;
		btn.setBackground(Color.YELLOW);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		JButton btn = (JButton)obj;
		btn.setBackground(Color.RED);
		
	}

	
}
