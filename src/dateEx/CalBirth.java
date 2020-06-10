package dateEx;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CalBirth {
	static Scanner scan = new Scanner(System.in);
	//연습문제 : 자기 태어난 연도를 입력받아서 현재 연도에 몇살인지 출력하는 프로그램.
	//91년 생 입력하면 2020년에는 만 28살입니다. (현재기준)
	//생년 입력 :1991
	//생월 입력 :12
	//생일 입력 :19
	
	static String regExp = "\\w{8}";
	static String data = "19911219";
	static int y = 0, m = 0, d = 0;
	
	public static void test(String[] args) {
		//이메일 형식을 검사하는 정규 표현식을 만들어 보세요
		// \\w == [a-zA-Z_0-9]
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		
		System.out.println("current: " + df.format(cal.getTime()));
		System.out.print("태어난 연도 입력: ");
		y = scan.nextInt();
		cal.add(Calendar.YEAR, -y);
		System.out.print("태어난 월 입력: ");
		m = scan.nextInt();
		cal.add(Calendar.MONTH, -m);
		System.out.print("태어난 일 입력: ");
		d = scan.nextInt();
		cal.add(Calendar.DATE, -d);
		
		System.out.println("after: " + df.format(cal.getTime()));
		
		//month 처리
	
//		System.out.println("현재 당신의 나이는 " + age +"입니다.");
	}
	
	
	public static void main(String[] args) {
		System.out.print("주민등록번호를 적어주세요.");
		String age = scan.nextLine().trim();
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);			// Calendar는 년도에 1900을 더하지 않아도 된다.(Date클래스는 더해야함)
		if(age.charAt(6) == '1' || age.charAt(6) == '2') { 
			// parInt는 ()안에 문자열이온다.
			// Integer.parseInt() : 괄호안의 문자열을 숫자로 변환한다.
			System.out.println(year - 1900 - Integer.parseInt(age.substring(0,2)) + "살");
		} else {
			System.out.println(year - 2000 - Integer.parseInt(age.substring(0,2)) + "살");			
		}

	}
	
}
