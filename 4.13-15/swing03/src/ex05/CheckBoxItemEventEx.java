package ex05;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CheckBoxItemEventEx extends JFrame{

	MyListener listener = new MyListener();
	Container c = getContentPane();
	String[] texts = {"���", "��", "ü��"};
	JCheckBox[] checks = new JCheckBox[texts.length];
	JLabel lblPrice = new JLabel("��� 100��, �� 500��, ü�� 20000��");
	JLabel lblSum = new JLabel("���� 0�� �Դϴ�");
	
	int sum = 0; //�հ� �ݾ�
	
	public CheckBoxItemEventEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("üũ�ڽ� ������ �̺�Ʈ ����");
		c.setLayout(new FlowLayout());
		c.add(lblPrice);
		
		for(int i = 0; i < texts.length; i++) {
			checks[i] = new JCheckBox(texts[i]);
			checks[i].addItemListener(listener);
			c.add(checks[i]);
		}
		c.add(lblSum);

//		checks[0] = new JCheckBox(texts[0]);
//		checks[0].addItemListener(listener);
//		c.add(checks[0]);
		
//		checks[1] = new JCheckBox(texts[1]);
//		checks[1].addItemListener(listener);
//		c.add(checks[1]);
		
		setSize(250, 400);
		setVisible(true);
	}
	
	// ���� Ŭ���� : �ܺ�Ŭ������ ����� ����� �� �ִ�
	class MyListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// System.out.println("üũ���� �ٲ�");
			// �����ؼ� üũ�� �ٲ���� üũ�ؼ� ������ �ٲ���� �˾ƺ��� ��
			
			// ��� �����ۿ��� üũ ���°� ���� �Ǿ����� �ľ�
			Object obj = e.getItem();
			
			int state = e.getStateChange(); // ���ϰ��� ���õ� ��쿡 ItemEvent.SELECTED, ������ ��쿡 ItemEvent.DESELECTED
			
			if(state == ItemEvent.SELECTED) { // üũ ���·� ����� ���
				if(obj == checks[0]) { // ���
					sum += 100;
				} else if(obj == checks[1]) { // ��
					sum += 500;
				} else if(obj == checks[2]) { // ü��
					sum += 20000;
				}
				
			} else { // ���� ���·� ����� ��� 
				if(obj == checks[0]) {
					sum -= 100;
				} else if(obj == checks[1]) {
					sum -= 500;
				} else if(obj == checks[2]) {
					sum -= 20000;
				}

			}
			// �հ� ���̺� ���簡�� ǥ��
			lblSum.setText("���� " + sum + "�� �Դϴ�");
		}
		
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
