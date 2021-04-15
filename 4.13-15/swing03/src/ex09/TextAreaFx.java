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
	JTextField tf2 = new JTextField("여기는 비활성화됨");
	
	public TextAreaFx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("텍스트 에어리어 예제");
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
		c.add(new JScrollPane(ta)); // 스크롤바가 달린 텍스트 에어리어
		c.add(tf2, BorderLayout.SOUTH);
		tf2.setEnabled(false); // 상호작용 못하도록 막음(아예 안됨)
		ta.setEditable(false); // 입력못하게 막음(쳐서 입력한 것이 출력되기는 하나 직접 입력은 못함)
		
	}


	public static void main(String[] args) {
		new TextAreaFx();

	}

}
