package ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�׼�!");
		Object obj = e.getSource(); // �׼��̺�Ʈ�� �߻��� ������Ʈ
		JButton btn = (JButton)obj; // �ش� ������Ʈ�� Ÿ������ �ٿ�ĳ����
		String text = btn.getText(); // ��ư�� ��� �� ���ڰ��� ������ �޼ҵ� ȣ��
		
		if(text.equals("��ư")) { // ��ư Ŭ���� ������ �ѱ�, ���� �����ư��鼭 ���� �� �ֵ���
			btn.setText("Button");
		} else {
			btn.setText("��ư");
		}
		
	}
	
}
