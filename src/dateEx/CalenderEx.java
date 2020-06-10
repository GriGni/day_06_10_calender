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
		
		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.print(day + "��");
		
		String[] weekStr = {"","��","��","ȭ","��","��","��","��"};
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekStr[week] +"����");
//		System.out.println(week == Calendar.WEDNESDAY);
		
		if(week == Calendar.WEDNESDAY) {
			System.out.println("������ �������Դϴ�.");
			System.out.println("�����Ͽ��� ������ �������~");
		}
	}
}
