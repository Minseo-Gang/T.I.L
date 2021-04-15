package ex09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextAreaFx extends JFrame{

	Container c = getContentPane();
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	JTextField tf2 = new JTextField("����� ��Ȱ��ȭ��");
	
	public TextAreaFx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�ؽ�Ʈ ����� ����");
		setUI();
		setSize(300, 200);
		setVisible(true);
	}
	
	
	private void setUI() {
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text + "\n");
				tf.setText("");
			}
		});
		
		c.add(tf, BorderLayout.NORTH);
		c.add(new JScrollPane(ta)); // ��ũ�ѹٰ� �޸� �ؽ�Ʈ �����
		c.add(tf2, BorderLayout.SOUTH);
		tf2.setEnabled(false); // ��ȣ�ۿ� ���ϵ��� ����(�ƿ� �ȵ�)
		ta.setEditable(false); // �Է¸��ϰ� ����(�ļ� �Է��� ���� ��µǱ�� �ϳ� ���� �Է��� ����)
		
	}


	public static void main(String[] args) {
		new TextAreaFx();

	}

}
