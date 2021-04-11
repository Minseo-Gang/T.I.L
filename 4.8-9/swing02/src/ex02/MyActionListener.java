package ex02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		JButton btn = (JButton)obj;
		Color color = btn.getBackground();
	
		if(btn.getBackground().equals(Color.RED)) {
			btn.setBackground(Color.YELLOW);
		}else {
			btn.setBackground(Color.RED);
		}
		
//		if(color.equals(Color.RED)) {
//			btn.setBackground(Color.YELLOW);
//		} else {
//			btn.setBackground(Color.RED);
//		}
	}

	
}
