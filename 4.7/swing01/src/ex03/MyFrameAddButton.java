package ex03;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameAddButton extends JFrame {
	Container container;
	JButton button = new JButton("��ư");
	
	public MyFrameAddButton() {
		
		container = getContentPane(); // �����ӿ� ��� �ִ� ����Ʈ �� ���
		container.add(button); //add() : �����̳ʿ� ������Ʈ �߰�(���̱�)
		setTitle("��ư�� �޸� â");
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrameAddButton();
	}
}
