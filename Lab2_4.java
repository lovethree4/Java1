package exam;

import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		int  num1;
		int  num2;
		int temp;
		
						
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		num1 = scanner.nextInt();
		System.out.println("두번째 정수 입력:");
		num2 = scanner.nextInt();
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		
		System.out.println("두정수의 값을 교환하면 "+num1 +","+num2+"입니다");
		
		
	
		 
				
		

	}

}
