package miniTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import miniTest.LoginChk;

public class Test {
	public static void main(String[] args) {
		JFrame frm = new JFrame("로그인");
		frm.setBounds(50, 100, 400, 120);
		frm.setLayout(new FlowLayout());

		JLabel idLabel = new JLabel("ID : ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');
		
		
		//로그인을 위한 버튼 생성
		JPanel panel = new JPanel();
		JButton loginBtn = new JButton("Login!");
		
		//로그인버튼 활성화
		loginBtn.addActionListener(new LoginChk(idText, pwText));
		
		//화면 구현
		panel.add(loginBtn);
		
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);
		frm.add(panel);
		
		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
