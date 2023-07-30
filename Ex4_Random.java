package exam;

public class Ex4_Random {

	public static void main(String[] args) {
		int num=  0;
		// 실수 난수 생성하기
		double r = Math.random();
		System.out.println("임의의 실수: " + r);
		
		// 1 ~100 사이의 정수 난수 생성하기
		num = (int)(Math.random() * 100) + 1;
		System.out.println("임의의 정수:" + num);
		
		// 1 ~ 6 사이의 정수 난수 생성하기
		num = (int)(Math.random() * 6) + 1;
		System.out.println("임의의 정수:" + num);
				
		

	}

}
