package exam;

public class Ex3_IncreDecre {

	public static void main(String[] args) {
		int x = 5, y = 5;
		int z;
		
		// 단독으로 사용될 경우
		x++;  //  후위(postfix)         x = 6
		//System.out.println("x=" + x);  // 6
		
	    --y;   // 전위(prefix)         // y = 4
		//System.out.println("y=" + y);     //4
		
		// 수식에 포함될 경우
		z = ++x;                      // z = 7 , x = 7
		//System.out.println("z="+ z); // 7
		
		z = y++;                     //  z = 4,  y = 5
		//System.out.println("z="+ z); // z = 4
		
		// 메소드호출에 포함될 경우
		System.out.println("x="+ (x++));        //출력:7 ,x = 8
		//System.out.println("x="+ (x+1));        //출력:9, x = 8
		//System.out.println("x="+x);              //출력:8, x = 8
		
		//System.out.println("y="+(++y));          //출력:6, x = 6
		//System.out.println("y="+(y--));         //출력:6,  y = 5
		//System.out.println("y=" +(y-1));        //출력4, y = 5
		//System.out.println("y=" +y);           //5
		
	
		
	}

}
