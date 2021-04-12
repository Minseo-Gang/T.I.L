package ex03;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ButtonEx extends JFrame{
	Container c = getContentPane();
	
	public ButtonEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("버튼 예제");
		JButton button = new JButton(new ImageIcon("images/scissor.png"));
		button.setRolloverIcon(new ImageIcon("images/rock.png"));
		button.setPressedIcon(new ImageIcon("images/paper.png"));
		setSize(500, 500);
		setVisible(true);
		c.add(button);
	}
	

	public static void main(String[] args) {
		new ButtonEx();
	}

}
