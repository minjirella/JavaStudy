package ch12;
/**
 * Web Crawling
 * @author jimin
 *
 */
public class Lotto {
	public static void main(String[] args) {
		NetworkUtil u = new NetworkUtil();
		String data = 
				u.get("https://dhlottery.co.kr/gameResult.do?method=byWin");
//		System.out.println(data);
		int sidx = data.indexOf("num win\">");
		int eidx = data.indexOf("</p>", sidx);
		
		String lotto = data.substring(sidx, eidx);
		System.out.println(lotto);
		System.out.println("============");
		
		// 숫자 시작하는 태그를 다시 찾기 위해서 substring 제 실행
		int pidx = lotto.indexOf("<p>");
		lotto = lotto.substring(pidx);
		
		sidx = 0; // 위에서 찾은 위치 초기화
		while(true) {
			sidx = lotto.indexOf("\">", sidx +1);
			System.out.println("sidx" + sidx);
			eidx = lotto.indexOf("<", sidx);
			System.out.println("eidx" + eidx);
			if(sidx == -1) break;
			String num = lotto.substring(sidx+2, eidx);
			System.out.println(num);
			sidx = eidx;
		}
	}
}
