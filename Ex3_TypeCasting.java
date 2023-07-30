package exam;

public class Ex3_TypeCasting {

	public static void main(String[] args) {
		// 형변환 연산자 사용하기
		double d = 3.14;
		int i = (int)d;  //값 손실
		System.out.println(i);
		
		float f = (float)83.5;
		byte b = 10;
		b = (byte)1000;
		System.out.println(b);
		
		// 자동형 변환
		i = /*(int)*/b; 
		f = /*(float)*/i;
		
		double result = 10/3;
		System.out.println("정수 나눗셈:" + result);
		
		double result2 = (double)10 / 3;
		System.out.println("실수 나눗셈: " + result2);
		
		// int보다 작은 type이 산술연산식에  피연산자일 경우 ==> int로 자동형변환
		byte x = 5, y = 10;
		byte resultB = (byte)(x * y);
		System.out.println(resultB);
		
		int c = 1_000_000;  //백만
		int de = 1_000_000;  //백만
		long resultL = (long)c * de;
		System.out.println(resultL);  //1조
		
		String str = "hello" + 3;
		System.out.println(str);
		
	}

}
