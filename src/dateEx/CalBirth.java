package dateEx;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CalBirth {
	static Scanner scan = new Scanner(System.in);
	//�������� : �ڱ� �¾ ������ �Է¹޾Ƽ� ���� ������ ������� ����ϴ� ���α׷�.
	//91�� �� �Է��ϸ� 2020�⿡�� �� 28���Դϴ�. (�������)
	//���� �Է� :1991
	//���� �Է� :12
	//���� �Է� :19
	
	static String regExp = "\\w{8}";
	static String data = "19911219";
	static int y = 0, m = 0, d = 0;
	
	public static void test(String[] args) {
		//�̸��� ������ �˻��ϴ� ���� ǥ������ ����� ������
		// \\w == [a-zA-Z_0-9]
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		
		System.out.println("current: " + df.format(cal.getTime()));
		System.out.print("�¾ ���� �Է�: ");
		y = scan.nextInt();
		cal.add(Calendar.YEAR, -y);
		System.out.print("�¾ �� �Է�: ");
		m = scan.nextInt();
		cal.add(Calendar.MONTH, -m);
		System.out.print("�¾ �� �Է�: ");
		d = scan.nextInt();
		cal.add(Calendar.DATE, -d);
		
		System.out.println("after: " + df.format(cal.getTime()));
		
		//month ó��
	
//		System.out.println("���� ����� ���̴� " + age +"�Դϴ�.");
	}
	
	
	public static void main(String[] args) {
		System.out.print("�ֹε�Ϲ�ȣ�� �����ּ���.");
		String age = scan.nextLine().trim();
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);			// Calendar�� �⵵�� 1900�� ������ �ʾƵ� �ȴ�.(DateŬ������ ���ؾ���)
		if(age.charAt(6) == '1' || age.charAt(6) == '2') { 
			// parInt�� ()�ȿ� ���ڿ��̿´�.
			// Integer.parseInt() : ��ȣ���� ���ڿ��� ���ڷ� ��ȯ�Ѵ�.
			System.out.println(year - 1900 - Integer.parseInt(age.substring(0,2)) + "��");
		} else {
			System.out.println(year - 2000 - Integer.parseInt(age.substring(0,2)) + "��");			
		}

	}
	
}
