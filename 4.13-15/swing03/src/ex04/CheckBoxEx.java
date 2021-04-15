package ex04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CheckBoxEx extends JFrame{
	
	Container c = getContentPane();

	
	public CheckBoxEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("üũ�ڽ� ����");
		
		c.setLayout(new FlowLayout()); // ȭ�� �����϶� '�帣��' ���� ������ �� �ִ� ���̾ƿ�
		JCheckBox check1 = new JCheckBox("���", true);
		c.add(check1);
		JCheckBox check2 = new JCheckBox("��");
		c.add(check2);
		
		// üũ���� ������ �̹���, üũ ������ �̹���
		ImageIcon image1 = new ImageIcon("images/paper.png");
		ImageIcon image2 = new ImageIcon("images/rock.png");
		JCheckBox check3 = new JCheckBox(image1); // üũ���� ����
		check3.setSelectedIcon(image2); // üũ ����
		check3.setBorderPainted(true); // �׵θ� �׸��� - ��ü�� ǥ�� (üũ�� : �����̰� / üũ������ : ���ͺ��̰�)
		c.add(check3);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
