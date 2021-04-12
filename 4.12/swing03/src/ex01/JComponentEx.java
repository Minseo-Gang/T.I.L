package ex01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JComponentEx extends JFrame implements ActionListener{
	
	Container c = getContentPane();
	JButton btn1 = new JButton("Magenta/Yellow Button");
	JButton btn2 = new JButton("Disabled Button");
	JButton btn3 = new JButton("getX(), getY()");
	
	
	public JComponentEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������Ʈ ���� �޼���");
		
		c.setLayout(new FlowLayout());
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	
		setSize(300, 300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new JComponentEx();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		JButton theButton = (JButton)obj;
		if(theButton == btn1) {
			btn1.setBackground(Color.YELLOW); // ����
			btn1.setForeground(Color.MAGENTA); // �����(���ڻ�)
			btn1.setFont(new Font("���� ���", Font.ITALIC, 20)); // �۲�
		} else if(theButton == btn2) {
			btn2.setEnabled(false);
		} else if(theButton == btn3) {
			JFrame f = (JFrame)btn3.getTopLevelAncestor();
			int x = btn3.getX();
			int y = btn3.getY();
			f.setTitle("(" + x + "," + y + ")");
			if(btn2.isVisible() == true) {
				btn2.setVisible(false);
			} else {
				btn2.setVisible(true);
			}
			
		}
				
	}
}
