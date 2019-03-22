package step08.Casting;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();  // Vehicle 인터페이스로 구현 객체인 Bus를 사용하려면 다음과 같이 변수를 선언하고 구현 객체를 대입 
		
		vehicle.run();  // 구현 클래스에서 재정의한 메소드 실행. 
		//vehicle.checkFare();  // Vehicle 인터페이스에는 checkFare메소드가 구현되어 있지 않음 
		
		Bus bus = (Bus) vehicle;   // 강제 타입 변환 
		 
		bus.run();
		bus.checkFare();  // 타입 변환되었으므로 bus객체의 checkFare()메소드 실행 
	}

}
