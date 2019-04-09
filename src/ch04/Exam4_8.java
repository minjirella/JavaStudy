package ch04;

public class Exam4_8 {

	public static void main(String[] args) {
//		for(int i = 30; i <= 100; i++) {
//			if(i==3) System.out.println(i + " : 3 포함");
//			System.out.println(i);
//			
//			for (int j = 1; j < i; j*=10) {
//				if(i % j != 3) {
//					continue;
//				}else System.out.println(i + " : 3 포함");
//			}

		for (int i = 1; i <= 1000; i++) {
			int n = i;
			while (n > 0) {
				int n2 = n % 10;
				if (n2 == 3) {
					System.out.println(n);
					break;
				}
				n = n / 10;
				System.out.println(i);

			}

		}
	}
}
