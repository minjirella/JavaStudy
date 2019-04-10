package ch05;

import java.util.ArrayList;

public class ExamStick {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 4, 3, 3, 8 };

		// 슈도코드 접근방식
//		1. 0보다 큰 배열 요소의 개수를 출력
//		2. 배열 요소중에서 0을 제외하고 가장 적은 수를 찾아냄
//		3. 가장 적은 수로 모든 배열 요소 값을 감소 (빼기)

		while (true) {
//			1
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					// 개수 세기
					cnt++;
				}
			}
			System.out.println(cnt);
			if(cnt <= 1) break;

//			2
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min && arr[i] > 0) {
					min = arr[i];
				}
			}
//			forEach 사용, 값 확인
//			for (int value : arr) {
//				value = value - min;
//				System.out.println(value);
//			}

//			3
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] - min;
			}
		}

	}

}
