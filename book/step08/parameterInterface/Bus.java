package step08.parameterInterface;

public class Bus implements Vehicle {  // Vehicle 인터페이스를 이용하는 클래스 
	@Override
	public void run() {  // 추상메소드 재정의 
		System.out.println("버스가 달립니다.");
	}
}
