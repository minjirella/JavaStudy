package ch21;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exam21_4 {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.display();
	}
}

class BtnHandler implements ActionListener {
	//bingo 2차원 배열
	int[][] bingo = new int[5][5];
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);

		// 선택된 버튼의 좌표 확인 (setName으로 지정된 값)
		String xy = btn.getName();
		
		//x y charAt(0)로 x,y 분리
		char x = xy.charAt(0);
		char y = xy.charAt(1);
		int numX = Integer.parseInt(x+"");
		int numY = Integer.parseInt(y+"");
		bingo[numX][numY] = 1;
		System.out.println(numX+""+numY);
		int rowChk = 0; int colChk = 0;
		int crossChk = 0; int revCrossChk = 0;
		
		for (int i = 0; i < 5; i++) {
			/* 가로줄 완성 확인 코드 */
			if(bingo[numX][i] == 1) {
				rowChk++;
				if(rowChk == 5) System.out.println((numX+1) + "줄 빙고");
			}
			
			/* 세로줄 완성 확인 코드 */
			if(bingo[i][numY] == 1) {
				colChk++;
				if(colChk == 5) System.out.println((numY+1) + "줄 빙고");
			}
			
			/* 대각선 완성 확인 코드 */
			if(bingo[i][i] == 1) {
				crossChk++;
			}
			
			if(bingo[i][4-i] == 1) {
				revCrossChk++;
			}
		}
		if(crossChk == 5) System.out.println("순방향 대각선줄 빙고");
		if(revCrossChk == 5) System.out.println("역방향 대각선줄 빙고");
	}
}