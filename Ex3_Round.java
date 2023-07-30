package exam;

public class Ex3_Round {

	public static void main(String[] args) {
		// Mach.round의 반환타입은 long타입.
		
		long result = Math.round(3.5);
		System.out.println(result);
		
		double pi = 3.141592;
		pi = pi * 1000;          // pi = 3141.592
		pi = Math.round(pi);   // pi = 3142.0
		pi = pi / 1000;          // pi = 3.142
		System.out.println(pi);
				
		
		

	}

}
