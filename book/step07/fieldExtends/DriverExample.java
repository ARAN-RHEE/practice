package step07.fieldExtends;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();  // Driver 객체 생성 
		
		Bus bus = new Bus();  //Bus객체 생성
		Taxi taxi = new Taxi(); //Taxi 객체 생성 
		
		driver.drive(bus); //driver 객체의 drive 메소드를 호출했다 하더라도 매개변수를 vehicle클래스의 자식인 Bus클래스의 bus를 주었기 때문에 
		// Bus클래스에서 오버라이딩 된 run()메소드가 실행됨. 자동으로 타입 변환됨.  Vehicle vehicle = bus;
		driver.drive(taxi); // Vehicle vehicle = taxi; //자식타입의 파라미터가 부모타입의 파라미터를 교체할 수 있음 

	}

}
