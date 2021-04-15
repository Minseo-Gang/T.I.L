package ex06;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioButtonEx extends JFrame{

	Container c = getContentPane();
	
	public RadioButtonEx() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("라디오 버튼 예제");
		c.setLayout(new FlowLayout());
		
		// 라디오 버튼을 하나로 묶을 그룹 객체 형성
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdoApple = new JRadioButton("사과");
		c.add(rdoApple);
		
		JRadioButton rdoPear = new JRadioButton("배", true); // 배가 체크된 상태의 라디오 버튼
		c.add(rdoPear);
		
		JRadioButton rdoRps = new JRadioButton(new ImageIcon("images/paper.png"));
		rdoRps.setSelectedIcon(new ImageIcon("images/rock.png")); // 체크상태일때의 이미지
		rdoRps.setBorderPainted(true);
		c.add(rdoRps);
		
		// 사과, 배 라디오 버튼을 그룹으로 묶음 - 그룹으로 묶여서 하나만 선택됨
		group.add(rdoApple);
		group.add(rdoPear);
		group.add(rdoRps);
		
		setSize(300, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
