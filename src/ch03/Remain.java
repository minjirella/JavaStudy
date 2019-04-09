package ch03;

public class Remain {
	public static void main(String[] args) {
		int num = 123;
		int n1 = num % 10; //3
		System.out.println(n1);
		num = num / 10; //12 
		int n2 = num % 10; //2
		num = num / 10; //1
		int n3 = num % 10; //1
		System.out.println(n2);
		System.out.println(n3);
		
		int beatTest = 0B00000101;
		beatTest = beatTest << 2;
		System.out.println(beatTest);
	}
}
