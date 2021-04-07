package ex03;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameAddButton extends JFrame {
	Container container;
	JButton button = new JButton("버튼");
	
	public MyFrameAddButton() {
		
		container = getContentPane(); // 프레임에 들어 있는 컨텐트 팬 얻기
		container.add(button); //add() : 컨테이너에 컴포넌트 추가(붙이기)
		setTitle("버튼이 달린 창");
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrameAddButton();
	}
}
