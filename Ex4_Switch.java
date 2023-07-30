package exam;

import java.util.Scanner;

public class Ex4_Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 성적은 ?");
		int score = scanner.nextInt();
		int num = 9;
		switch(score/10) {
		case 9 :
		case 10 :
			System.out.println("A 학점입니다");
			break;
		case 8 :
			System.out.println("B 학점입니다");
			break;
		case 7 :
			System.out.println("C 학점입니다");
			break;
		case 6 :
			System.out.println("D 학점입니다");
			break;
		default :
			System.out.println("F 학점입니다");
	        break;
		}
				
		switch(score/10){
		case 9,10 -> System.out.println("A 학점입니다");
		case 8 -> System.out.println("B 학점입니다");
		case 7 -> System.out.println("C 학점입니다");
		case 6-> System.out.println("D 학점입니다"); 
		default -> System.out.println("F 학점입니다");
		}
		char grade = switch(score/10) {
		case 9,10 -> 'A';
		case 8 ->'B';
		case 7 ->'C';
		case 6 ->'D';
		default -> 'F';
		};
		System.out.println("학점은" + grade + "입니다");
	}
		
		
	
