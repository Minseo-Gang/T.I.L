package ex06;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyGridLayout extends JFrame{
	
	Container c = getContentPane();
	
	public MyGridLayout() {
		// 창닫기 옵션
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 컨테이너의 레이아웃을 그리드 레이아웃으로 변경
		c.setLayout(new GridLayout(4, 3, 10, 10));
		// 버튼 12개 만들기
		for (int i = 1; i <= 12; i++) {
			c.add(new JButton(String.valueOf(i)));
		}
		// 창크기
		setSize(500, 500);
		// 창보기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyGridLayout();
	}

}
