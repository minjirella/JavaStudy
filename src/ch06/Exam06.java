package ch06;

public class Exam06 {
	public static void main(String[] args) {
		int n = 100;
		int total = getTotal(n);
		System.out.println("1 ~ " + n + " 까지의 합 : " + total);
	}
	
	public static int getTotal(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}
