package access;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car(0, 2, "조민");
		
		car.getCarInfo();
		car.carAccel();
		car.carAccel();
		car.getCarInfo();
		car.carBreak();
		car.carBreak();
		car.carBreak();
		car.carBreak();
		car.getCarInfo();
		
	}

}
