package dateEx;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class CalenderEx {
	
	public static Scanner scan = new Scanner(System.in);
	public static void test(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.print(day + "일");
		
		String[] weekStr = {"","일","월","화","수","목","금","토"};
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekStr[week] +"요일");
//		System.out.println(week == Calendar.WEDNESDAY);
		
		if(week == Calendar.WEDNESDAY) {
			System.out.println("오늘은 수요일입니다.");
			System.out.println("수요일에는 집에서 쉬어야죠~");
		}
	}
}
