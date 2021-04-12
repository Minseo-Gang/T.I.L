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
	JButton button = new JButton("��ư");
	JButton button2 = new JButton("��ư2");
	
	MyActionListener listener = new MyActionListener();
	// -> MyActionListener [is-a] ActionListener
	MyActionListener2 listener2 = new MyActionListener2();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�͸� Ŭ����");
		
		// ��ư�� ������ Ŭ������ ������� �׼Ǹ����� ���̱�
		//button.addActionListener(listener); // ������ Ŭ����
		//button.addActionListener(listener2); // ���� Ŭ����
		
		// �͸� ���� Ŭ���� ��� - ��ü��(�ν��Ͻ� �̸�)�� �ʿ� ���� ��� - �̸����� ��(.)��� ������ �ʿ� ����
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư Ŭ����3");
				
			}
		});
		
		button2.addActionListener(listener2);
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư Ŭ����3");
				
			}
		});
		

		c.setLayout(new FlowLayout());
		c.add(button);
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	// �׼Ǹ����ʸ� ���� Ŭ������ �ۼ�
	public class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("��ư Ŭ����2");
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
