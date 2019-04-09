package ch03;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		int score = 0;
		System.out.print("숫자 입력 >");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt(); //입력받은 값을 score 변수에 저장.
		
		char grade = score >= 90 ? 'A':(score>=80 ? 'B':'C');
			
		System.out.println(grade);
		
		scan.close();
	}
}
