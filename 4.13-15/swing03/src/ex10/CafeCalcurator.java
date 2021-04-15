package ex10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CafeCalcurator extends JFrame implements ActionListener{
	final int ESPRESSO_PRICE = 1550;
	final int AMERICANO_PRICE = 2320;
	final int CAFELATTE_PRICE = 3630;
	
	Container c = getContentPane();
	JPanel pnlNorth = new JPanel();
	JPanel pnlSouth = new JPanel();
	JPanel pnlCenter = new JPanel();
	ButtonGroup group = new ButtonGroup();
	
	JRadioButton rdoEspresso = new JRadioButton("에스프레소", true);
	JRadioButton rdoAmericano = new JRadioButton("아메리카노");
	JRadioButton rdoCafelatte = new JRadioButton("카페라떼");
	
	JLabel labelInput = new JLabel("투입");
	JTextField txtInput = new JTextField(7);
	JLabel labelChange = new JLabel("거스름돈");
	JTextField txtChange = new JTextField(7);
	JButton btn = new JButton("주문");
	
	JTextField txt5000 = new JTextField();
	JTextField txt1000 = new JTextField();
	JTextField txt500 = new JTextField();
	JTextField txt100 = new JTextField();
	JTextField txt50 = new JTextField();
	JTextField txt10 = new JTextField();
	
	JCheckBox chk5000 = new JCheckBox();
	JCheckBox chk1000 = new JCheckBox();
	JCheckBox chk500 = new JCheckBox();
	JCheckBox chk100 = new JCheckBox();
	JCheckBox chk50 = new JCheckBox();
	
//	String[] strMoneys = {"5천원", "1천원", "500원", "100원", "50원", "10원"};
//	JLabel[] lblMoneys = new JLabel[strMoneys.length];
//	JTextField[] txtMoneys = new JTextField[strMoneys.length];
//	JCheckBox[] chkMoneys = new JCheckBox[strMoneys.length - 1];
	
	JLabel menu = new JLabel("에스프레소 - 1,550원 / 아메리카노 - 2,320원 / 카페라떼 - 3,630원");
	
	public CafeCalcurator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("카페자판기");
		
		setUI();
		
		setListener();
		
		setSize(700, 500);
		setVisible(true);

	}

	private void setUI() {
//		for(int i = 0; i < lblMoneys.length; i++) {
//			lblMoneys[i] = new JLabel(strMoneys[i]);
//			txtMoneys[i] = new JTextField("0");
//			if(i < lblMoneys.length - 1) {
//				chkMoneys[i] = new JCheckBox("", true);
//			}
//		}
		
		group.add(rdoEspresso);
		group.add(rdoAmericano);
		group.add(rdoCafelatte);
		
		//pnlNorth
		pnlNorth.add(rdoEspresso);
		pnlNorth.add(rdoAmericano);
		pnlNorth.add(rdoCafelatte);
		
		pnlNorth.add(labelInput);
		pnlNorth.add(txtInput);
		pnlNorth.add(btn);
		pnlNorth.add(labelChange);
		pnlNorth.add(txtChange);
		c.add(pnlNorth, BorderLayout.NORTH);
		
		// pnlCenter
//		pnlCenter.setLayout(new GridLayout(6, 3));
//		for(int i = 0; i < strMoneys.length; i++) {
//			pnlCenter.add(lblMoneys[i]);
//			pnlCenter.add(txtMoneys[i]);
//			if(i < lblMoneys.length - 1) {
//				pnlCenter.add(chkMoneys[i]);
//			}
//		}
		
		//pnlSouth
		pnlSouth.add(menu);
		c.add(pnlSouth, BorderLayout.SOUTH);
		
		
		pnlCenter.setLayout(new GridLayout(6, 3, 5, 5));
		pnlCenter.add(new JLabel("5천원"));
		pnlCenter.add(txt5000);
		pnlCenter.add(chk5000);
		pnlCenter.add(new JLabel("1천원"));
		pnlCenter.add(txt1000);
		pnlCenter.add(chk1000);
		pnlCenter.add(new JLabel("500원"));
		pnlCenter.add(txt500);
		pnlCenter.add(chk500);
		pnlCenter.add(new JLabel("100원"));
		pnlCenter.add(txt100);
		pnlCenter.add(chk100);
		pnlCenter.add(new JLabel("50원"));
		pnlCenter.add(txt50);
		pnlCenter.add(chk50);
		pnlCenter.add(new JLabel("10원"));
		pnlCenter.add(txt10);
		c.add(pnlCenter);
		
	}

	private void setListener() {
		btn.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new CafeCalcurator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btn) {
			// 투입 금액에서 라디오 버튼에 해당하는 가격을 뺀 거스름돈 구하기
			String strInputMoney = txtInput.getText();
			int iInputMoney = Integer.parseInt(strInputMoney);
			int changeMoney = 0;
			if (rdoEspresso.isSelected() == true) {
				changeMoney = iInputMoney - ESPRESSO_PRICE;
				txtChange.setText(String.valueOf(changeMoney));
			} else if(rdoAmericano.isSelected() == true) {
				changeMoney = iInputMoney - AMERICANO_PRICE;
				txtChange.setText(String.valueOf(changeMoney));
			} else if(rdoCafelatte.isSelected() == true) {
				changeMoney = iInputMoney - CAFELATTE_PRICE;
				txtChange.setText(String.valueOf(changeMoney));
			}
			
			// txt5000에 remain값이 입력되면 체크박스 체크
			

			int count = changeMoney / 5000;
			int remain = changeMoney % 5000;
			//System.out.println("count:" + count);
			txt5000.setText(String.valueOf(count));
			
			int remain1 = changeMoney % 1000;
			count = remain / 1000;
			txt1000.setText(String.valueOf(count));
			
			int remain2 = changeMoney % 500;
			count = remain1 / 500;
			txt500.setText(String.valueOf(count));
				
			int remain3 = changeMoney % 100;
			count = remain2 / 100;
			txt100.setText(String.valueOf(count));
			
			int remain4 = changeMoney % 50;
			count = remain3 / 50;
			txt50.setText(String.valueOf(count));
			
			int remain5 = changeMoney % 10;
			count = remain4 / 10;
			txt10.setText(String.valueOf(count));
			
			
		} // if

		
	} // actionevent

}
