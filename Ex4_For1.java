package exam;

public class Ex4_For1 {

	public static void main(String[] args) {
		
		for( int i=0; i<10;  i++) {
			System.out.println("안녕하세요");
		}
		for( int i=1; i<=5; i++) {
			System.out.println("i =" + i);
		}
		System.out.println();
		for( int i=5; i>=1; i--) {
			System.out.println("i =" + i);
		}
		System.out.println();
		
		// 1 ~ 10 까지 홀수만 출력하기
		for( int i = 1; i<=10; i +=2) {
			System.out.println("i = " + i);
		}
		System.out.println();
		// 10 ~ 1까지 짝수만 출력하기
		for( int i = 10; i>=1; i -=2) {
			System.out.println("i= " + i);
		}

	}

}
