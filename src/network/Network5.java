package network;

import com.ggoreb.kakao_api.TranslateUtil;
import com.ggoreb.kakao_api.VisionUtil;

public class Network5 {
	public static void main(String[] args) {
		String key = "00fb39a9547ad8f92ab80a0a72c4f408";
//		VisionUtil vu = new VisionUtil(key);
//		
//		String result = vu.sendFile("d:/a.jpg");
//		System.out.println(result);
		
		TranslateUtil tu = new TranslateUtil(key);
		String r = tu.sendText("kr", "en", "밥먹었니?");
		System.out.println(r);
	}
}
