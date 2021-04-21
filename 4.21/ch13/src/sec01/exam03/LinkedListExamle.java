package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamle {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		// ArrayList �۾��ð�
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �۾��ð� : " + (endTime - startTime));
		
		// LinkedList �۾��ð�
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �۾��ð� : " + (endTime - startTime));

	}

}
