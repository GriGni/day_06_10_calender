package reg_Pattern;

import java.util.regex.Pattern;

public class regExPatternEx {
	
	public static void main(String[] args) {
		//이메일 형식을 검사하는 정규 표현식을 만들어 보세요
		// \\w == [a-zA-Z_0-9]
		String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data = "king@shop.com";
		 if(args.length >= 1) {			 
			 data = args[0];
		 }
		 // regExp와 data가 같은 형식인지 알려주는 것이 pattern.matches이다.
		 boolean result = Pattern.matches(regExp, data);
		 if(result) {
			 System.out.println((data + "는 올바른 형식입니다."));
		 }else {
			 System.out.println(data + "는 바른 형식이 아닙니다.");
		 }
	}
	
	 public static void test(String[] args) {
		//정규표현식 준비.
		 String regExp = "(02|010|054)-\\d{3, 4} - \\d{4}";
		 String data = "010-1234-5678";
		 if(args.length >= 1) {			 
			 data = args[0];
		 }
		 boolean result = Pattern.matches(regExp, data);
		 if(result) {
			 System.out.println((data + "는 올바른 형식입니다."));
		 }else {
			 System.out.println(data + "는 바른 형식이 아닙니다.");
		 }
	}
}
