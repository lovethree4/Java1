package exam;

public class Ex2_print1 {

	public static void main(String[] args) {
		//
		System.out.println(3 + "7" + "7" );   // "377"
		System.out.println(3 + 7+"7");   // 10 + "7" -->"10" + "7" --> "107"
		System.out.println("3" + 'a');   // "3" + "a" --> "3a"
		System.out.println("3" + 7 + 7);   //"37" + 7 -->"377"
		
		String name = "김 은 진";
		int age = 20;
		
		System.out.println(name + "은" + age + "살 입니다");
		
		
		

	}

}
