package access;

public class Car {
	private int speed;
	private int gas;
	private String owner;

	public Car(int speed, int gas,  String owner) {
		this.speed = speed;
		this.gas = gas;
		this.owner = owner;
	}
	
	public void getCarInfo() {
		System.out.println("속도 : " + this.speed);
		System.out.println("연료 : " + this.gas);
		System.out.println("차주 : " + this.owner);
		
	}
	
	public void carAccel() {
		if(this.gas <= 1) {
			this.gas = 0;
			return;
		}
		this.speed += 10;
		this.gas -= 2;
	}
	
	public void carBreak() {
		if(gas > 0) {
			
		
		this.speed -= 10;
		}else {
			return;
		}
		
	}
	
	
}
