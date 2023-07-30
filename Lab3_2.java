package exam;

import java.util.Scanner;


public class Lab3_2 {

	public static void main(String[] args) {
		
						
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("윗변 :");
		double a = scanner.nextInt();
		System.out.println("밑면 :");
		double b = scanner.nextInt();
		System.out.println("높이 :");
		double c = scanner.nextInt();
		
				
		
		double result = ((a + b) * c/2) ;
		System.out.println("사다리꼴의 넓이는"+result+"입니다");
				
	 
		
		
		

	}

}
