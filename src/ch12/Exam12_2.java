package ch12;

public class Exam12_2 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
//		String msg = "Cyqw amkc, cyqw em";
		String msg = "map.html";

		/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */

		/* A ~ Z, a ~ z 사이의 문자이면 아스키 코드를 2 증가시킨 후 출력 */
		/* 단, X / x / Z / z 의 경우 2 증가 시 */
		/* 알파벳 범위를 벗어나지 않도록 처리 */
		/* A ~ Z, a ~ z 사이의 문자가 아니면 그대로 출력 */
		
		int len = msg.length();
		for (int i = 0; i < len; i++) {
			char c = msg.charAt(i);
			
			if(!(c >= ASCII_a && c <= ASCII_z
					|| c >= ASCII_A && c <= ASCII_Z)) {
				System.out.print(c);
				continue;
			}
			
			if (c > ASCII_z || (c > ASCII_Z && c < ASCII_a)) {
				c -= 26;
			}else c += (char)2;
			
			
			
			System.out.print(c);
		}
	}
}