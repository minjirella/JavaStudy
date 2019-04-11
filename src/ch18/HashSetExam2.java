package ch18;

import java.util.ArrayList;
import java.util.TreeSet;

public class HashSetExam2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1번");
		list.add("2번");
		list.add("2번");
		list.add("=> 3번");
		list.add("=> 4번");
		System.out.println("ArrayList elements");
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
//		HashSet<Integer> lotto = new HashSet<Integer>();
		while(true) {
			int num = (int)(Math.random()*45+1);
			lotto.add(num);
			if(lotto.size() ==6) break;
		}
		System.out.println(lotto);
		
	}
}