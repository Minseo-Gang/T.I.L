package ex09;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame2 extends JFrame implements ActionListener {
	
	Container c = getContentPane();
	JButton button = new JButton("버튼");
	JButton button2 = new JButton("버튼2");
	
	public MyFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("익명 클래스");
		
		c.setLayout(new FlowLayout());
		c.add(button);
		c.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyFrame2();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// button 객체와 button2 객체는 MyFrame2의 멤버이므로 이곳으로 바로 가져다가 쓸 수 있다.
		// 어떤 버튼과 같은 객체인지를 비교
		Object obj = e.getSource();
		// 다시 버튼으로 바라보고 다운캐스팅 하는 경우
		// JButton btn = (JButton)obj;
		if(obj == button) {
			System.out.println("첫번째 버튼 클릭됨");
		} else if(obj == button2) {
			System.out.println("두번째 버튼 클릭됨");
		}
		
	}
}
