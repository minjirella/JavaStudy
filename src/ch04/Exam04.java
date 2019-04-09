package ch04;

public class Exam04 {

	public static void main(String[] args) {
//		4_2_1
		int score = 23;
		if(score % 2 == 0 && score % 3 == 0) {
			System.out.println("ÄôÂ¦");
		}else if(score % 2 == 0) {
			System.out.println("Â¦");
		}else if(score % 3 == 0) {
			System.out.println("Äô");
		}else System.out.println("Å¯");
	
	
//		4_2_2
		int year = 2100;
		if(year % 400 == 0) System.out.println("À±³â");
		else if(year % 100 == 0) System.out.println("Æò³â");
		else if(year % 4 == 0) System.out.println("À±³â");
		else System.out.println("Æò³â");		
	}
}
