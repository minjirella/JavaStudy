package ch18;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1번");
		list.add("2번");
		list.add("=> 3번");
		list.add("=> 4번");
		System.out.println("ArrayList elements");
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		list.remove(3);
		list.remove(2);
		list.add(0, "=> 3번");
		list.add(1, "=> 4번");
		System.out.println("ArrayList elements");
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		while(true) {
			int num = (int)(Math.random()*45+1);
			lotto.add(num);
			if(lotto.size() ==6) break;
		}
		System.out.println(lotto);
		
	}
}