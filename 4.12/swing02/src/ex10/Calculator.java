package ex10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener{
	
	Container c = getContentPane();
	
	JTextField textfd = new JTextField("0");
	
	JPanel pnlCenter = new JPanel();

	String[] btnTexts = {"C", "��", "+", "-", 
						"7", "8", "9", "*" , 
						"4", "5", "6", "/", 
						"1", "2", "3", "%", 
						".", "0", "="};
	
	// + ���� ��ư ���������� ����
	boolean isOper = false;
	String prevValue = "";
	String op = null;
		
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����");
		setSize(300, 400);
		setVisible(true);
		setUI();
		
	}
	
	public void setUI() {
		c.add(textfd, BorderLayout.NORTH);
		pnlCenter.setLayout(new GridLayout(5, 4, 5, 5));
		for(int i = 0; i < 19; i++) {
			JButton button = new JButton(btnTexts[i]);
			button.addActionListener(this);
			pnlCenter.add(button);
		}
		c.add(pnlCenter);
	}

	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// ��ư�� ���ڸ� ������ ���ؼ� Object -> JButton Ÿ������ �ٶ�
		JButton aButton = (JButton)obj;
		// ��ư���� �ٶ󺸱� ������ ��ư�� ����� ����� �� ����
		String buttonText = aButton.getText();
		
		switch(buttonText) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			
			if(isOper == true) {
				textfd.setText(buttonText);
				isOper = false;
			} else {
				String newText = "";
				if (textfd.getText().equals("0")) {
					textfd.setText(buttonText);
				} else {
					newText = textfd.getText() + buttonText;
					textfd.setText(newText);
				}
			}
			
			
			break;
		case "C":
			textfd.setText("0");
			break;
		case "��":
			String text = textfd.getText();
			if(text.length() >= 2) {
				String subText = text.substring(0, text.length() - 1);
				textfd.setText(subText);
			} else {
				textfd.setText("0");
			}
			break;
			
		case "+": case "-": case "*": case "/": case "%":
			op = buttonText;
			prevValue = textfd.getText(); // ���� �� ����
			isOper = true;
			break;
		case "=":
//			System.out.println("prevValue:" + prevValue);
//			System.out.println("nowValue:" + textfd.getText());
			int iPrevValue = Integer.parseInt(prevValue);
			int iNowValue = Integer.parseInt(textfd.getText());
			int result = 0;
			switch(op) {
			case "+":
				result = iPrevValue + iNowValue;
				break;
			case "-":
				result = iPrevValue - iNowValue;
				break;
			case "*":
				result = iPrevValue * iNowValue;
				break;
			case "/":
				result = iPrevValue / iNowValue;
				break;
			case "%":
				result = iPrevValue % iNowValue;
				break;
			}
			break;
		
		}
		
		
	}
}



