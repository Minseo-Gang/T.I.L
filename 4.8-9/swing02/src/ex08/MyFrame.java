package ex08;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{

	Container c = getContentPane();
	JLabel myLabel = new JLabel("Java");
	MyKeyAdapter listener = new MyKeyAdapter();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("직접해보기");
		
		c.setLayout(null);
		myLabel.setBounds(0, 0, 100, 50);
		c.add(myLabel);
		c.addKeyListener(listener);
		listener.setLblTarget(myLabel);

		setSize(300, 300);
		setVisible(true);
		
		c.requestFocus();
	}
	
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
	

	public static void main(String[] args) {
		new MyFrame();
	}
}
