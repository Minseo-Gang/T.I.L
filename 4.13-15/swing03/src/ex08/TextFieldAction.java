package ex08;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextFieldAction extends JFrame implements ActionListener{

	Container c = getContentPane();
	JTextField txtNorth = new JTextField();
	JTextField txtSouth = new JTextField();
	
	ImageIcon[] images = {new ImageIcon("images/left.png"), new ImageIcon("images/right.png") };
	JLabel lblCenter = new JLabel(images[0]);

	public TextFieldAction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("텍스트필드 액션 이벤트");
		setUI();
		setListener();
		setSize(300, 200);
		setVisible(true);
	}
	
	private void setUI() {
		txtNorth.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		txtSouth.setFont(new Font("굴림체", Font.ITALIC, 40));
		
		c.add(txtNorth, BorderLayout.NORTH);
		c.add(txtSouth, BorderLayout.SOUTH);
		c.add(lblCenter);
	}
	
	private void setListener() {
		txtNorth.addActionListener(this);
		txtSouth.addActionListener(this);
	}


	public static void main(String[] args) {
		new TextFieldAction();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == txtNorth) {
			String text = txtNorth.getText();
			txtSouth.setText(text);
			txtNorth.setText("");
			lblCenter.setIcon(images[1]);
			
		} else if(obj == txtSouth) {
			String text = txtSouth.getText();
			txtNorth.setText(text);
			txtSouth.setText("");
			lblCenter.setIcon(images[0]);
		}
		
	}

}
