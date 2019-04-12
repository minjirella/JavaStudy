package ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		//요소 배치 설정
		j.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("등록");
		JButton b2 = new JButton();
		b2.setText("이전");
		
		j.add(b1);
		j.add(b2);
		
		//크기지정 (w,h)
		j.setSize(200,100);
		
		//보이기
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
