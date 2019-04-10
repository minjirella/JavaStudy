package ch07;

public class MemMain {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = "aa";
		m1.password = "test";
		m1.name = "jimin";
		m1.age = 28;
		
		System.out.println(m1.toString());
	}

}
