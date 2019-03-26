package step08.parameterInterface;

public class Taxi implements Vehicle { // Vehicle 인터페이스를 이용하는 클래스 
	@Override
	public void run() { //인터페이스의 추상 메소드 오버라이딩 
		System.out.println("택시가 달립니다.");
		
	}
}
