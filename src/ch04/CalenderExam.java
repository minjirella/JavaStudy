package ch04;

import java.util.Calendar;

public class CalenderExam {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; // 0~11���� ��ϵǾ�����.
		int date = c.get(Calendar.DATE);
		int lastDate = c.getActualMaximum(Calendar.DATE);
		int week = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(lastDate);
		System.out.println(week);

		System.out.println(year);
		System.out.println(month);
		System.out.println(date);

		// �޷��� ��¥�� ������ ������ ����.
		c.set(year, month - 1, 1);
		week = c.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i <= lastDate; i++, week++) {
			System.out.print(i);
			if(week % 7 ==0) System.out.println();
		}
	}
}
