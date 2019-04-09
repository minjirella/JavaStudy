package ch05;

public class ArrayExam {
	public static void main(String[] args) {
		int[][] arr1 = new int[][]{
			 {1, 2},
			 {4, 5, 6},
			 {7, 8, 9, 3, 4},
			 {10, 11, 12, 5}
		};
		System.out.println(arr1[1][1]);
		System.out.println(arr1[1].length);
		
//		가변배열의 덧셈
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum += arr1[i][j];
			}
		}
		System.out.println(sum);
	}
}
