package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// System.out.println("listũ�� : " + list.size()); // size : �迭�� length�� ����
		list.add("java");
		// System.out.println("listũ�� : " + list.size());
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		// System.out.println("listũ�� : " + list.size());
		
		// list���� Ư�� �ε����� ������ ��������
		// 2��° : list[2] -> list.get(2)
		String str = list.get(2);
		// System.out.println("str : " + str);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------------");
		
		for(String data : list) {
			System.out.println(data);
		}
		
		
		
	}

}
