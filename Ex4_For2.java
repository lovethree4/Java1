package exam;

public class Ex4_For2 {

	public static void main(String[] args) {
		int sum = 0;      // 누적합계값
		
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		
		
		for( int i=1; i <=10; i++) {
			sum  += i;
		}
		System.out.println(sum);
		// 1 ~ 100 까지의 누적합 과 누적곱을 구하기
	}

}
