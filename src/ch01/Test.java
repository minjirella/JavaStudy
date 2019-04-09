package ch01;

public class Test {

	public static void main(String[] args) {
		// UNIX Time
		System.out.println(System.currentTimeMillis());
		
//		Random 0.0 <= X < 1.0
		System.out.println(Math.random());
//		주사위 범위 조작 Random 범위에 *내가 원하는 숫자
		System.out.println(Math.random() * 6);
		System.out.println((int)(Math.random() * 6) + 1); //형변환 - Casting

	}

}
