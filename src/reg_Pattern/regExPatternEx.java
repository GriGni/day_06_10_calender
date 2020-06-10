package reg_Pattern;

import java.util.regex.Pattern;

public class regExPatternEx {
	
	public static void main(String[] args) {
		//�̸��� ������ �˻��ϴ� ���� ǥ������ ����� ������
		// \\w == [a-zA-Z_0-9]
		String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data = "king@shop.com";
		 if(args.length >= 1) {			 
			 data = args[0];
		 }
		 // regExp�� data�� ���� �������� �˷��ִ� ���� pattern.matches�̴�.
		 boolean result = Pattern.matches(regExp, data);
		 if(result) {
			 System.out.println((data + "�� �ùٸ� �����Դϴ�."));
		 }else {
			 System.out.println(data + "�� �ٸ� ������ �ƴմϴ�.");
		 }
	}
	
	 public static void test(String[] args) {
		//����ǥ���� �غ�.
		 String regExp = "(02|010|054)-\\d{3, 4} - \\d{4}";
		 String data = "010-1234-5678";
		 if(args.length >= 1) {			 
			 data = args[0];
		 }
		 boolean result = Pattern.matches(regExp, data);
		 if(result) {
			 System.out.println((data + "�� �ùٸ� �����Դϴ�."));
		 }else {
			 System.out.println(data + "�� �ٸ� ������ �ƴմϴ�.");
		 }
	}
}
