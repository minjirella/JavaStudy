package ch18;

import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		TreeSet<Integer> my = new TreeSet<Integer>();
		
		lotto.add(10);lotto.add(20);lotto.add(36);
		lotto.add(38);lotto.add(40);lotto.add(41);
		
//		my.add(10);my.add(20);my.add(36);
//		my.add(38);my.add(40);my.add(41);
//		
//		System.out.println(lotto.containsAll(my));
//		내가 선택하는 번호가 언제 lotto정답과 똑같아질까..
		int count = 0;
		
		while(true) { // 1등번호 맞출때까지
			my.clear();
			while(true) { // 내 번호가 6개 만들어질때까지
				int num= (int) ((Math.random() * 45) + 1);
				my.add(num);
				if(my.size() == 6 ) break;
			}
			count++;
			System.out.println(count);
			boolean isMatch = lotto.containsAll(my);
			if(isMatch) break;
		}
		System.out.println("시도횟수 = " + count);
	}
}
