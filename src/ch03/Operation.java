package ch03;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		int score = 0;
		System.out.print("���� �Է� >");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt(); //�Է¹��� ���� score ������ ����.
		
		char grade = score >= 90 ? 'A':(score>=80 ? 'B':'C');
			
		System.out.println(grade);
		
		scan.close();
	}
}
