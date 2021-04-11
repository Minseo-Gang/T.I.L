package ex05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class MyMouseAdapter extends MouseAdapter{
	
	private JLabel lblTarget;
	
	public void setLblTarget(JLabel label) {
		lblTarget = label;
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		lblTarget.setLocation(x, y);
	}

//	@Override
//	public void mousePressed(MouseEvent e) {
//		int x = e.getX();
//		int y = e.getY();
//		// e.getSource(); // Container¿”, no label
//		lblTarget.setLocation(x, y);
//	
//	}

	
	
	
	
	
}
