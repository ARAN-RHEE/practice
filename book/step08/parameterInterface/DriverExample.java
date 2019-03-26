package step08.parameterInterface;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();  // driver 객체 생성. drive 메소드는 파라미터로 vehicle 타입 필요 
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);  // 자동 타입 변환. vehicle = bus
		driver.drive(taxi); // 자동 타입 변환. vehicle = taxi
	}

}
