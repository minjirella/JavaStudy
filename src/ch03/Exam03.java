package ch03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
//		01
		boolean result = 1 + 2 / 2 >= 1 + 1 * 2;
		System.out.println("결과 : " + result);

//		02
		float div = (float) 5 / 2;
		System.out.println("나누기 결과 : " + div);

//		03
		int dividend = 23;
		int divisor = 5;
		int div03 = dividend / divisor;
		int remain = dividend % divisor;
		System.out.println("몫 : " + div03);
		System.out.println("나머지 : " + remain);

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
			System.out.print("2자리수 정수 입력(10~99) >> ");
			n = sc.nextInt();
			if (n<10 || n>=100) {
				System.out.println("다시 입력해주세요.");
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

		System.out.println("각 자리 숫자의 합 : " + total);

//		08
		int num08 = 10;
		System.out.println((num08 > 0) ? "양수" : "음수");

//		09
		char ch = 'T';
		char lowerCase = (ch >= (char) 65 && ch < (char) 97) ? (char) (ch + 32) : ch;
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
