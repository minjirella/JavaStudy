package ch21;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.json.JSONArray;
import org.json.JSONObject;
//오픈API 활용, 윈도우 어플리케이션 만들기.

public class Swing_ScrollPane{
	public static void main(String[] args) {
		try {
			URL url = new URL("https://dapi.kakao.com/v2/search/image?query=metallica");
			URLConnection con = url.openConnection();
			con.addRequestProperty("Authorization", "KakaoAK 00fb39a9547ad8f92ab80a0a72c4f408");

			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);

			String result = "";

			while (true) {
				String data = reader.readLine();
				if (data == null)
					break;
				result += data;
//				System.out.println(data);
			}
//			System.out.println(result);
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
					JButton b = (JButton)e.getComponent();
					String text = b.getText();
//					System.out.println(text);
					try {
						Desktop.getDesktop().browse(new URI(text));
					} catch (IOException ex) {
						ex.printStackTrace();
					} catch (URISyntaxException ex) {
						ex.printStackTrace();
					}
					
				}
			};
			
			// JSON 문자열을 JSON 객체로 변경
			JSONObject obj = new JSONObject(result);
			JSONArray documents = obj.getJSONArray("documents");
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(0, 1));
			for (int i = 0; i < 20; i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");
				System.out.println(image_url);
				
				// 버튼 컴포넌트 만들기!
				JButton b1 = new JButton(image_url);
//				j.add(b1);
				panel.add(b1);
				b1.addMouseListener(ml); //addMouseListener 인터페이스로 생성 
			}
			JScrollPane jp = new JScrollPane(panel);
			j.add(jp);
			j.setSize(500,300);
			
			//보이기
			j.setVisible(true);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
