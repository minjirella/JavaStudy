package ch04;

import java.util.Scanner;

public class WhileExam2 {
	/*
	 * ���� while ���2 - ����
	 */
	public static void main(String[] args) {
		boolean isContinue = true;

		Scanner sc = new Scanner(System.in);

		while (isContinue) {
			System.out.println("����0, ����1, ��2");
			System.out.print("�����Է�");
			int player = sc.nextInt();
			int com = (int) (Math.random() * 3);
			System.out.println(player + "/" + com);
			
			if (player == com) {
				System.out.println("���");
			} else {
				if ((player + 1) % 3 == com) {
					System.out.println("��");
				} else {
					System.out.println("�̱�");
					isContinue = false;
				}
			}
		}
		sc.close();
	}
}
