package ch06;

public class Method1 {
	public static void main(String[] args) {
		System.out.println(1);
		char second = sum(2,'A');
		System.out.println(second);
		System.out.println(3);
		System.out.println((double) Math.pow(2, 38));
	}
	
	public static char sum(int a, char c) {
		char trans = (char) (c + a);
		return trans;
	}
}
