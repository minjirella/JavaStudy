package ch21;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		//요소 배치 설정
		j.setLayout(new FlowLayout());
		
		MouseListener ml = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}			
			@Override
			public void mousePressed(MouseEvent e) {}			
			@Override
			public void mouseExited(MouseEvent e) {}			
			@Override
			public void mouseEntered(MouseEvent e) {}			
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton b = (JButton)e.getSource();
				String text = b.getText();
				System.out.println(text);
			}
		};
		
		JButton b1 = new JButton("등록");
		b1.addMouseListener(ml); //addMouseListener 인터페이스로 생성 
		
		JButton b2 = new JButton("이전");
		b2.addMouseListener(ml); //addMouseListener 인터페이스로 생성 
		
		j.add(b1);
		j.add(b2);
		
		//크기지정 (w,h)
		j.setSize(200,100);
		
		//보이기
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
