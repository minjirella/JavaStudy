package ch07;

public class Static {
	static char color = 'R';
	static int num = 0;
	int score = 0;

	static void staticMethod() {
		score = score +1;
		System.out.println("static method");
		num++;
	}

	void instanceMethod() {
		Static s = new Static();
		s.score = s.score +1;
		System.out.println("instance method");
	}
}