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
		setTitle("�ؽ�Ʈ�ʵ� �׼� �̺�Ʈ");
		setUI();
		setListener();
		setSize(300, 200);
		setVisible(true);
	}
	
	private void setUI() {
		txtNorth.setFont(new Font("���� ���", Font.BOLD, 30));
		txtSouth.setFont(new Font("����ü", Font.ITALIC, 40));
		
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
