package exam;

import java.util.Scanner;

public class Ex2_Scanner2 {
	
	public static void main(String[] args) {
		int num;
		double d;		
		Scanner scanner = new Scanner(System.in);  
		
		System.out.println("정수를 입력하세요; ");
		num = scanner.nextInt(); 
		System.out.println("입력된 정수:" + num);
		
		System.out.println("실수를 입력하세요: ");
		d = scanner.nextDouble();
		System.out.println("입력된 실수: " + d);
		
		
			
		

	}

}
