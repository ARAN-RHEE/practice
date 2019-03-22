package step08.Casting;

public class Bus implements Vehicle {  // Vehicle 인터페이스를 이용하는 클래스 
	@Override
	public void run() {  // 추상메소드 재정의 
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {  // Bus 클래스에서 선언한 메소드 
		System.out.println("승차요금을 체크합니다.");
	}
}
