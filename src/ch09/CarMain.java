package ch09;

public class CarMain {
	static void drive(Car car) {
		car.move();
	}
	
	public static void main(String[] args) {
		SportsCar lambo = new SportsCar();
		drive(lambo);
		SportsCar2 lambo2 = new SportsCar2();
		drive(lambo2);
	}

}
