package miniTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginChk implements ActionListener {
	private JTextField id;
	private JPasswordField pw;
	private int failCnt = 0;

	public LoginChk(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String inputId = id.getText();
		String inputPw = new String(pw.getPassword());
				
		//로그인 성공여부 체크		// null값 체크
		if(inputId.equals("ai") && inputPw.equals("1234")) {
			System.out.println("로그인 성공");
			System.out.println(inputId + "님 환영합니다");
		}else if(inputId.trim().equals("") || inputPw.trim().equals("")){
			System.out.println("아이디와 비밀번호는 빈칸일 수 없습니다.");
			id.setText("");
			pw.setText("");
		}else {
			System.out.println("로그인 실패!");
			System.out.println("5회이상 실패시, 접속이 차단됩니다.");
			id.setText("");
			pw.setText("");
			failCnt++;
		}
		
		if(failCnt == 5) System.exit(0);
		//로그인 실패시 메시지출력
		//로그인 5회 실패시 접속차단			
		//로그인 시도 후 텍스트박스 초기화
		
	}
}