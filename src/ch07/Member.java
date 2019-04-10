package ch07;

public class Member {
	String id;
	String password;
	String name;
	int age;
	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int a) {
//		if (a < 0 || a > 200) {
//			System.out.println("잘못된 나이입니다.");
//			return; //유효성검사 기능 - 캡슐화 / 은닉화
//		}
//		age = a;
//	}

	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
