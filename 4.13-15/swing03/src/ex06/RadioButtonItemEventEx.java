package ex06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioButtonItemEventEx extends JFrame{
	// 프레임의 컨테이너
	Container c = getContentPane();
	// 라디오 버튼 배치할 패널
	JPanel pnlRadio = new JPanel(); // 기본배치관리자 : FlowLayout
	String[] texts = {"가위", "바위", "보"};
	JRadioButton[] radios = new JRadioButton[texts.length];
	ButtonGroup group = new ButtonGroup();
	ImageIcon[] images = {
			new ImageIcon("images/scissor.png"), 
			new ImageIcon("images/rock.png"), 
			new ImageIcon("images/paper.png")
			};
	JLabel lblImage = new JLabel(images[0]);
	
	
	public RadioButtonItemEventEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("라디오 버튼 아이템 예제");
		
		for(int i = 0; i < texts.length; i++) {
//			if(i == 0) {
//				radios[i] = new JRadioButton(texts[i], true);
//			} else {
//				radios[i] = new JRadioButton(texts[i]);
//			}
			
			radios[i] = new JRadioButton(texts[i]);
			radios[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// 체크, 해제의 2개 이벤트가 발생함
					// 해제 이벤트는 무시
					int state = e.getStateChange();
					
					if(state == ItemEvent.DESELECTED) {
						return;
					}
					
					Object obj = e.getItem();
					// 체크된 라디오 버튼에 따라서 이미지 변경
					if(obj == radios[0]) {
						lblImage.setIcon(images[0]);
					} else if(obj == radios[1]) {
						lblImage.setIcon(images[1]);
					} else if(obj == radios[2]) {
						lblImage.setIcon(images[2]);
					}
				}
			});
			
			group.add(radios[i]);
			pnlRadio.add(radios[i]);
			
		}
		radios[0].setSelected(true); // 가위를 체크된 상태로 초기화
		
		pnlRadio.setBackground(Color.GRAY);
		c.add(pnlRadio, BorderLayout.NORTH);
		c.add(lblImage, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new RadioButtonItemEventEx();

	}

}
