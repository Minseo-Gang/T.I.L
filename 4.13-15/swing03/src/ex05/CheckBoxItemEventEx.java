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
	String[] texts = {"사과", "배", "체리"};
	JCheckBox[] checks = new JCheckBox[texts.length];
	JLabel lblPrice = new JLabel("사과 100원, 배 500원, 체리 20000원");
	JLabel lblSum = new JLabel("현재 0원 입니다");
	
	int sum = 0; //합계 금액
	
	public CheckBoxItemEventEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("체크박스 아이템 이벤트 예제");
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
	
	// 내부 클래스 : 외부클래스의 멤버를 사용할 수 있다
	class MyListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// System.out.println("체크상태 바뀜");
			// 해제해서 체크가 바뀐건지 체크해서 해제가 바뀐건지 알아보는 것
			
			// 어느 아이템에서 체크 상태가 변경 되었는지 파악
			Object obj = e.getItem();
			
			int state = e.getStateChange(); // 리턴값이 선택된 경우에 ItemEvent.SELECTED, 해제된 경우에 ItemEvent.DESELECTED
			
			if(state == ItemEvent.SELECTED) { // 체크 상태로 변경된 경우
				if(obj == checks[0]) { // 사과
					sum += 100;
				} else if(obj == checks[1]) { // 배
					sum += 500;
				} else if(obj == checks[2]) { // 체리
					sum += 20000;
				}
				
			} else { // 해제 상태로 변경된 경우 
				if(obj == checks[0]) {
					sum -= 100;
				} else if(obj == checks[1]) {
					sum -= 500;
				} else if(obj == checks[2]) {
					sum -= 20000;
				}

			}
			// 합계 레이블에 현재가격 표시
			lblSum.setText("현재 " + sum + "원 입니다");
		}
		
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
