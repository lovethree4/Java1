package exam;

public class Ex2_print2 {
							
	public static void main(String[] args) {	
		
		String name = "김은진";
		int age = 20;
		char ch = 'a';
		double pi = 3.141592;
		// 형식지정자 ==>%(문자열), %d(10진수 정수), %f(실수), %c(문자)
		
		System.out.printf("나의 이름은 %s 입니다\n", name);
		System.out.printf("[%10s]는 [%d]살입니다", name, age);
		System.out.printf("[%-10s]는 [%-5d]살입니다\n",name, age);	//왼쪽 정렬
		System.out.printf("파이는 %f입니다", pi);

	}

}
