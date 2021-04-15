package ex06;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioButtonEx extends JFrame{

	Container c = getContentPane();
	
	public RadioButtonEx() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ��ư ����");
		c.setLayout(new FlowLayout());
		
		// ���� ��ư�� �ϳ��� ���� �׷� ��ü ����
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdoApple = new JRadioButton("���");
		c.add(rdoApple);
		
		JRadioButton rdoPear = new JRadioButton("��", true); // �谡 üũ�� ������ ���� ��ư
		c.add(rdoPear);
		
		JRadioButton rdoRps = new JRadioButton(new ImageIcon("images/paper.png"));
		rdoRps.setSelectedIcon(new ImageIcon("images/rock.png")); // üũ�����϶��� �̹���
		rdoRps.setBorderPainted(true);
		c.add(rdoRps);
		
		// ���, �� ���� ��ư�� �׷����� ���� - �׷����� ������ �ϳ��� ���õ�
		group.add(rdoApple);
		group.add(rdoPear);
		group.add(rdoRps);
		
		setSize(300, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
