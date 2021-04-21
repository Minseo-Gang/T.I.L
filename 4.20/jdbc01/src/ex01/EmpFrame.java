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
		setTitle("사원정보");
		textArea.setFont(new Font("맑은 고딕", Font.BOLD, 30));
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
		// 데이터베이스 접근 객체 - DAO(Database Access Object)
		// 데이터 객체 - VO(Value Object)		
		
	}
}
