package ch03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
//		01
		boolean result = 1 + 2 / 2 >= 1 + 1 * 2;
		System.out.println("��� : " + result);

//		02
		float div = (float) 5 / 2;
		System.out.println("������ ��� : " + div);

//		03
		int dividend = 23;
		int divisor = 5;
		int div03 = dividend / divisor;
		int remain = dividend % divisor;
		System.out.println("�� : " + div03);
		System.out.println("������ : " + remain);

//		04
		int num04 = 456;
		System.out.println((num04 / 100) * 100);

//		05
		int num05 = 333;

		System.out.println((num05 / 10) * 10 + 1);

//		06
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("2�ڸ��� ���� �Է�(10~99) >> ");
			n = sc.nextInt();
			if (n<10 || n>=100) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}else {
				break;
			}
		}
		int ten = n / 10;
		int one = n % 10;

		boolean isMatch = false;
		isMatch = (ten == one);

		System.out.println(isMatch);
		sc.close();

//		07
		int num07 = 65432;
		int total = 0;

		for (int i = 1; i < 100000; i *= 10) {
			total = total + (num07 / i) % 10;
		}

		System.out.println("�� �ڸ� ������ �� : " + total);

//		08
		int num08 = 10;
		System.out.println((num08 > 0) ? "���" : "����");

//		09
		char ch = 'T';
		char lowerCase = (ch >= (char) 65 && ch < (char) 97) ? (char) (ch + 32) : ch;
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
