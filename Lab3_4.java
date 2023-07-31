package exam;

import java.util.Scanner;
public class Lab3_4 {

	public static void main(String[] args) {
		System.out.println(" 홈파티 인원은 몇 명인가요?");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		double num2 = scanner.nextDouble();
		
		double result =num2 /3;
		System.out.println("num2 = " + num1);
		System.out.println(result);
		
		double result2 = num2 / 4;
		System.out.println("num2 = " + num1);
		System.out.println(result2);
		
		System.out.println("치킨은"+result +"마리,"+"피자는"+result2+"판 주문해야 합니다.");
		
		
		// TODO Auto-generated method stub

	}

}
