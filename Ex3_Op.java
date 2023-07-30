package exam;

import java.util.Scanner;

public class Ex3_Op {

	public static void main(String[] args) {
		int score;
		char grade = ' ' ;       // 문자변수는 공백문자로 초기화
		
		// 조건연산자를 사용하여 홀짝 판별하기
		System.out.println("정수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num % 2 == 0) ? "짝수" : "홀수");
		
		// 조건연산자를 중첩으로 사용하기
		System.out.println("성적은?");
		score = sc.nextInt();
		grade = (score >=90) ? 'A' : (score >=80) ? 'B' :'C';	
		System.out.println(score + "점은" + grade + "학점 입니다"	);
		
		// 복합대입연산자 사용하기
		num = 10;
		num += 10;
		System.out.println("num = " + num);
		num -= 10;
		System.out.println("num = " + num);
		num *= 3;
		System.out.println("num = " + num);
		num /= 10;
		System.out.println("num = " + num);
		num %= 3;
		System.out.println("num = " + num);
		
		
		
				
		
		

	}

}
