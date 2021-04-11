package ex06;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class MyKeyAdapter extends KeyAdapter {

	private JLabel lblTarget;
	final int MOVE_UNIT = 10;
	
	public void setLblTarget(JLabel label) {
		lblTarget = label;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int x = lblTarget.getX();
		int y = lblTarget.getY();
		lblTarget.setLocation(x, y);
		
		int keyCode = e.getKeyCode();
		switch(keyCode) {
		case KeyEvent.VK_UP:
			lblTarget.setLocation(x, y - MOVE_UNIT);
			break;
		case KeyEvent.VK_DOWN:
			lblTarget.setLocation(x, y + MOVE_UNIT);
			break;
		case KeyEvent.VK_LEFT:
			lblTarget.setLocation(x - MOVE_UNIT, y);
			break;
		case KeyEvent.VK_RIGHT:
			lblTarget.setLocation(x + MOVE_UNIT, y);
			break;
		}

		
		
	}

}
