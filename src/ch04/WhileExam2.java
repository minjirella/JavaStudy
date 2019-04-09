package ch04;

import java.util.Scanner;

public class WhileExam2 {
	/*
	 * 교안 while 사용2 - 변형
	 */
	public static void main(String[] args) {
		boolean isContinue = true;

		Scanner sc = new Scanner(System.in);

		while (isContinue) {
			System.out.println("가위0, 바위1, 보2");
			System.out.print("숫자입력");
			int player = sc.nextInt();
			int com = (int) (Math.random() * 3);
			System.out.println(player + "/" + com);
			
			if (player == com) {
				System.out.println("비김");
			} else {
				if ((player + 1) % 3 == com) {
					System.out.println("짐");
				} else {
					System.out.println("이김");
					isContinue = false;
				}
			}
		}
		sc.close();
	}
}
