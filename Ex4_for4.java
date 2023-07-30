//* 구구단 전체 출력하기
//*/

package exam;

public class Ex4_for4 {

	public static void main(String[] args) {
		// 구구단 전체 출력하기
//      2 * 1 = 2
//		2 * 2 = 4
//      2 * 3 = 6
//      2 * 4 = 8
//      2 * 5 = 10	
//      2 * 6 = 12
//      2 * 7 = 14
//      2 * 8 = 16
//      2 * 9 = 18
		for(int dan = 2; dan <=9 ; dan ++) {
			for(int i=1; i<= 9 ; i++)  {
				System.out.printf("%d * %d = %d\n" , dan , i, dan * i );
				
			}
		}
			//구구단 전체 가로로 출력하기
			
	}
	
}
	    	
	


