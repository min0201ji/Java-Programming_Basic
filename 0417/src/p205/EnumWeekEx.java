package p205;

import java.util.Calendar;

public class EnumWeekEx {
	public static void main(String ar[]) {
		Week today = null;
		
		Calendar cal=Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today=Week.SUNDAY;break;
		case 2: today=Week.MONDAY;break;
		case 3: today=Week.TUESDAY;break;
		case 4: today=Week.WEDNESDAY;break;
		case 5: today=Week.THURSDAY;break;
		case 6: today=Week.FRIDAY;break;
		case 7: today=Week.SATURDAY;break;
	
		}
		System.out.println("오늘 요일 : "+today); //컴퓨터 시스템 날짜를 따라감!
		
	}
}