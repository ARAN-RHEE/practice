package step08.instance;


public class Driver {
	public void drive(Vehicle vehicle) { // drive 메소드의 매개값이 vehicle
		// bus객체의 checkFare()메소드를 호출하기 위해서 강제 타입 변환을 해주어야 함. 
		if(vehicle instanceof Bus) {  // vehicle 매개 변수가 참조하는 객체가 Bus라면 
			Bus bus = (Bus) vehicle; // 강제 타입 변환시킴 
			bus.checkFare(); // 메소드 호출 
		}
		
		vehicle.run();
	}
}
