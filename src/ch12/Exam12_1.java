package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("아이디를 입력해주세요. => ");
			
			String id = s.nextLine();
			int idLen = id.length();

			boolean isUpper = false;
			boolean isLower = false;

			/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */
			for (int i = 0; i < idLen; i++) {
				char c = id.charAt(i);
				if(c >= ASCII_A && c <= ASCII_Z) isUpper = true;
				else if(c >= ASCII_a && c <= ASCII_z) isLower = true;
			}
			
			if(isUpper == true && isLower == true) {
				System.out.println("입력하신 아이디는 " + id + " 입니다.");
				break;
			}
			else {
				System.out.println("아이디를 확인해주세요.");
				continue;
			}
		}	
		System.out.println("정상가입되었습니다.");
		s.close();
		/* ASCII_A 등 미리 정의되어 있는 아스키 코드 상수를 이용하여 */
		/* 대문자와 소문자 입력 여부 확인 */		
		/* 대문자와 소문자 입력 여부에 따라 결과 출력 */
		
	}
}