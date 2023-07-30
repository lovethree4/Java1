package exam;

public class Ex2_2 {

	public static void main(String[] args) {
		// 정수형 변수 사용하기
		int unm = 10;
		byte varB = 127;    // byte타입 -128 ~ 127
		
		System.out.println(varB);
		
		// 실수형 변수 사용하기
		double radius , pi = 3.141592;
//		System.out.println(radius); // error. 초기화되지 않은 변수는 사용할 수 없다.
		System.out.println(pi);
		
		// 문자형 변수 사용하기
		char ch = 'A';   // 65;  // 'A'의 unicode=65 가 저장됨
		char ch2 = '가';
		System.out.println(ch);
		System.out.println(ch2);
		
		// 문자열형 변수 사용하기
		String string = "abc";
		System.out.println(string);
		
		//논리형 변수 사용하기
		boolean boo = false;
		System.out.println(boo);
		
		//두변수의 값 교환하기
		int a = 5;
		int b = 10;
		int temp;     //임시 변수
		temp = a;    //temp = 5
		a = b;         //a = 10;
		b =temp;
		
		System.out.println(a);
		System.out.println(b);
		
			
		}

}
