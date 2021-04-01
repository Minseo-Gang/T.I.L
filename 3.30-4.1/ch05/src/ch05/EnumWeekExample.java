package ch05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); // 현재 시각 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		} // switch
		
		//if(week == 1) { // 코드를 이해하기 어려움
		
		if(today == Week.SUNDAY) { //코드를 이해하기 용이함
			System.out.println("일요일에는 축구를 한다");
		} else {
			System.out.println("열심히 자바 공부함");
		}
		
		
		
	} //main

}
