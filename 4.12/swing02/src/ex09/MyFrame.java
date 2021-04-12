package ex09;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	
	Container c = getContentPane();
	JButton button = new JButton("버튼");
	JButton button2 = new JButton("버튼2");
	
	MyActionListener listener = new MyActionListener();
	// -> MyActionListener [is-a] ActionListener
	MyActionListener2 listener2 = new MyActionListener2();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("익명 클래스");
		
		// 버튼에 독립된 클래스로 만들어진 액션리스너 붙이기
		//button.addActionListener(listener); // 독립된 클래스
		//button.addActionListener(listener2); // 내부 클래스
		
		// 익명 내부 클래스 사용 - 객체명(인스턴스 이름)이 필요 없는 경우 - 이름으로 점(.)찍고 접근할 필요 없음
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭됨3");
				
			}
		});
		
		button2.addActionListener(listener2);
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭됨3");
				
			}
		});
		

		c.setLayout(new FlowLayout());
		c.add(button);
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	// 액션리스너를 내부 클래스로 작성
	public class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼 클릭됨2");
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
