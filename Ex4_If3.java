


package exam;

import java.util. Scanner;

public class Ex4_If3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 하나 입력하세요: ");
		String string = scanner.nextLine();
		char ch = string.charAt(0);
		
		if ('0' <= ch && ch <= '9' )  {
			System.out.println("숫자문자입니다");
		} else if( 'A' <= ch && ch <= 'Z') {
			System.out.println( "영문 대문자입니다");
		} else if( 'a' <= ch && ch <= 'z' ) {
			System.out.println("영문 소문자입니다");
		} else {
			System.out.println("영문자/숫자 모두 아닙니다");
		}
		System.out.println("나이는?");
		int age = scanner.nextInt();
		if ( age < 10 || age > 70) {
			System.out.println("노약자입니다");
		} else {
			System.out.println("노약자가 아닙니다");
	    }
	}		

}
