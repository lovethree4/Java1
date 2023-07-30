package exam;

import java.util.Scanner;

public class Ex2_Scanner1 {
	
	public static void main(String[] args) {
		String str;
		
		Scanner scanner;  //  auto import ==> ctrl + shift + 0
		scanner = new Scanner(System.in);  // 객체 생성
		
		
		System.out.println("문자열을 입력하세요;");
		str = scanner.nextLine();  // 문자열 입력받기 .  객체 사용
		
		System.out.println("입력된 문자열:" + str);
		
		

	}

}
