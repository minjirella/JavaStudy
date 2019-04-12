package ch13;

public class S_USB extends USB {

	@Override
	public void connect() {
		System.out.println("conncted!");
	}
	
	public static void main(String[] args) {
		new USB() { //익명클래스

			@Override
			public void connect() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
}
