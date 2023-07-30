package exam;

public class Ex2_Literal {

	public static void main(String[] args) {
		// 상수 사용하기
		final int MAX_SIZE = 10;
//		MAX_SIZE = 20;  //상수는 값 변경이 안됨
				
		int num = 2100000000;   //21억
		
		long num2 = 21_000_000_000L;   //210억
		System.out.println(num2);
		
		double num3 = 3.14f;
		float num4 = 3.14f;   // 실수 리터럴의 default type은 double 이므로, float 자료형에 저장하려면f
				
				

	}

}
