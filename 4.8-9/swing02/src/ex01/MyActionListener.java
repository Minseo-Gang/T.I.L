package ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("액션!");
		Object obj = e.getSource(); // 액션이벤트가 발생한 컴포넌트
		JButton btn = (JButton)obj; // 해당 컴포넌트의 타입으로 다운캐스팅
		String text = btn.getText(); // 버튼의 기능 중 글자값을 얻어오는 메소드 호출
		
		if(text.equals("버튼")) { // 버튼 클릭할 때마다 한글, 영문 번갈아가면서 나올 수 있도록
			btn.setText("Button");
		} else {
			btn.setText("버튼");
		}
		
	}
	
}
