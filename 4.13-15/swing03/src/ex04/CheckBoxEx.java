package ex04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CheckBoxEx extends JFrame{
	
	Container c = getContentPane();

	
	public CheckBoxEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("체크박스 예제");
		
		c.setLayout(new FlowLayout()); // 화면 움직일때 '흐르듯' 같이 움직일 수 있는 레이아웃
		JCheckBox check1 = new JCheckBox("사과", true);
		c.add(check1);
		JCheckBox check2 = new JCheckBox("배");
		c.add(check2);
		
		// 체크해제 상태의 이미지, 체크 상태의 이미지
		ImageIcon image1 = new ImageIcon("images/paper.png");
		ImageIcon image2 = new ImageIcon("images/rock.png");
		JCheckBox check3 = new JCheckBox(image1); // 체크해제 상태
		check3.setSelectedIcon(image2); // 체크 상태
		check3.setBorderPainted(true); // 테두리 그리기 - 입체감 표현 (체크시 : 들어가보이게 / 체크해제시 : 나와보이게)
		c.add(check3);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
