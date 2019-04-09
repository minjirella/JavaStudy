package ch04;

public class Exam4 {

	public static void main(String[] args) {
//		1
		int sum01 = 0;
		for(int i=0; i<100; i++) {
			sum01 += i;
		}
		System.out.println(sum01);
		
//		2
		int sum02 = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 14 == 0) {
				sum02 += i;
				System.out.println(i);
			}
		}
		System.out.println("각 숫자들의 합"+sum02);
	}

}
