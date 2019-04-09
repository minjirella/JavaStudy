package ch04;

public class Exam04_6 {

	public static void main(String[] args) {
//		Left Side
		System.out.println("=====Left=====");
		int space = 0;
		
		for (int i = 1; i <= 5; i++) {
			space = 5-i;
			
			for (int j = 1; j <= 5; j++) { //2차원으로의 접근
				if(j <= space) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		
//		Right Side
		System.out.println("=====Right=====");
		space = 0;
		
		for (int i = 1; i <= 5; i++) {
			space = 5-i;
			space = i-1;
			
			for (int j = 1; j <= 5; j++) { //2차원으로의 접근
				if(j <= space) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		
//		Diamond
//		TODO
		System.out.println("===Diamond===");
		space = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
