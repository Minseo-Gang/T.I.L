package ex02;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LabelEx extends JFrame{
	
	Container c = getContentPane();
	//�ؽ�Ʈ ���̺�
	JLabel label1 = new JLabel("����մϴ�");
	
	//�̹��� ���̺�
	ImageIcon image = new ImageIcon("images/puppy.jpg");
	JLabel label2 = new JLabel(image);
	
	//�ؽ�Ʈ + �̹��� ���̺�
	JLabel label3 = new JLabel("��������", new ImageIcon("images/kaonashi.jpg"), SwingConstants.CENTER);
	
	public LabelEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���̺���");
		c.setLayout(new FlowLayout());
		c.add(label1);
		c.add(label2);
		c.add(label3);
		setSize(500, 600);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new LabelEx();
	}
	
}
