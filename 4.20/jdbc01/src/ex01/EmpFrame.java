package ex01;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class EmpFrame extends JFrame{

	EmpDao empDao = EmpDao.getInstance();
	Container c= getContentPane();
	JTextArea textArea = new JTextArea();
	
	public EmpFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�������");
		textArea.setFont(new Font("���� ���", Font.BOLD, 30));
		c.add(textArea);
		setSize(500, 500);
		setVisible(true);
		
		EmpVo empVo = empDao.getEmpList();
		
		int empno = empVo.getEmpno();
		String ename = empVo.getEname();
		String job = empVo.getJob();
		int sal = empVo.getSal();
		
		textArea.append(empno + " | ");
		textArea.append(ename + " | ");
		textArea.append(job + " | ");
		textArea.append(sal + " | ");
	}
	
	public static void main(String[] args) {
		new EmpFrame();
		// �����ͺ��̽� ���� ��ü - DAO(Database Access Object)
		// ������ ��ü - VO(Value Object)		
		
	}
}
