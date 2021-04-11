package ex06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased");
	}
	
//	KeyEvent - 키보드 관련 이벤트
//	KeyListener - 키 리스너
//	KeyEvent가 발생되는 컴포넌트는 포커스를 얻은 컴포넌트

}
