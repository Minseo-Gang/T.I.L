package ex07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImageChanger extends JFrame implements ActionListener{

	Container c = getContentPane();
	JPanel pnlDown = new JPanel();
	ImageIcon imgLeft = new ImageIcon("images/left.png");
	ImageIcon imgRight = new ImageIcon("images/right.png");
	JButton btnLeft = new JButton(imgLeft);
	JButton btnRight = new JButton(imgRight);
	ImageIcon[] images = {
			new ImageIcon("images/image0.jpg"),
			new ImageIcon("images/image1.jpg"),
			new ImageIcon("images/image2.jpg"),
			new ImageIcon("images/image3.jpg"),
			};

	int index = 0;
	JLabel lblImage = new JLabel(images[index]);
	
	public ImageChanger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이미지체인저");
		
		pnlDown.add(btnLeft);
		pnlDown.add(btnRight);
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);
		
		c.add(pnlDown, BorderLayout.SOUTH);
		pnlDown.setBackground(Color.YELLOW);
		c.add(lblImage, BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new ImageChanger();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btnLeft) {
			index--;
			if(index == -1) {
				index = 3;
			}
			lblImage.setIcon(images[index]);
			
		} else if (obj == btnRight) {
			index++;
			if(index == 4) {
				index = 0;
			}
			lblImage.setIcon(images[index]);
		}

		
//		if(obj == btnLeft) {
//			if(index == 0) {
//				lblImage.setIcon(images[0]);
//				index = 3;
//			} else if(index == 3) {
//				lblImage.setIcon(images[3]);
//				index = 2;
//			} else if(index == 2) {
//				lblImage.setIcon(images[2]);
//				index = 1;
//			} else if(index == 1) {
//				lblImage.setIcon(images[1]);
//				index = 0;
//			}	
//		} else {
//			if(index == 0) {
//				lblImage.setIcon(images[0]);
//				index = 1;
//			} else if(index == 1) {
//				lblImage.setIcon(images[1]);
//				index = 2;
//			} else if(index == 2) {
//				lblImage.setIcon(images[2]);
//				index = 3;
//			} else if(index == 3) {
//				lblImage.setIcon(images[3]);
//				index = 0;
//			}	
			
			
			
		}
	
	}


