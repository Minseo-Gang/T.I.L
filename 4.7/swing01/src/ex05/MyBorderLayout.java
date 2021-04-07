package ex05;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyBorderLayout extends JFrame{
	// 배치할 위치를 지정, 위치를 지정하지 않으면 center에 
	Container c = getContentPane();
	JButton btnNorth = new JButton("북쪽");
	JButton btnSouth = new JButton("남쪽");
	JButton btnEast = new JButton("동쪽");
	JButton btnWest = new JButton("서쪽");
	JButton btnCenter = new JButton("중앙");
	
	public MyBorderLayout() {
		// 배치관리자 -> borderlayout
		// 창닫기 옵션 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창제목 설정
		this.setTitle("보더 레이아웃");
		// 창크기 설정
		this.setSize(500, 500);
		// 컴포넌트 설정
		this.setComponents();
		// 창 보이기
		this.setVisible(true);
	}
	
	private void setComponents() {
		c.add(btnNorth, BorderLayout.NORTH);
		c.add(btnSouth, BorderLayout.SOUTH);
		c.add(btnEast, BorderLayout.EAST);
		c.add(btnWest, BorderLayout.WEST);
		c.add(btnCenter, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new MyBorderLayout();
	}

}
