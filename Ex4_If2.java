package exam;

import java.util.Scanner;

public class Ex4_If2 {

	public static void main(String[] args) {
		int score = 0;
			char grade = ' ' ;    //문자는 공백문자로 초기화
		
		System.out.println("점수는 ?");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		if(score >=90 ) {
			grade = 'A';
		} else if(score>=80) {      // 80 ~ 89
			grade = 'B';
		} else if(score>=70) {     //  70 ~ 79
			grade = 'c';
		} else if(score>=60) {	   //  60 ~ 69
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("학점은" + grade +"입니다");

	}

}
