package exam;

import java.util.Scanner;

public class Ex4_Switch2 {

	public static void main(String[] args) {
		System.out.println("계절은? ");
		Scanner scanner = new Scanner(System.in);				
		String season = scanner.nextLine();
		
		switch(season)  {
		case"봄":
			System.out.println("spring");
			break;
		case"여름":
			System.out.println("Summer");
			break;
		case"가을":
			System.out.println("Fall");
			break;
		case"겨울":
			System.out.println("winter");
			break;
		default:
			System.out.println("4계절이 아니네요");
			break;
		
				
		}
		
	}

}
