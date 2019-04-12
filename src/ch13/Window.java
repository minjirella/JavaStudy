package ch13;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {

	public static void main(String[] args) {

		JFrame j = new JFrame();

		JButton btn = new JButton();
		
		btn.addMouseListener(new MouseListener() { //익명클래스 사용시

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}}); // 버튼 동작 정의

		j.add(btn);

		j.setSize(200, 200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}

}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("안녕");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
