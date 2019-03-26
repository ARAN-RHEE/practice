package step07.fieldExtends;

public class Bus extends Vehicle{  // Bus 클래스는 Vehicle 클래스의 자식 클래스 
	@Override
	public void run() {  //따라서 run()메소드를 오버라이딩 함 
		System.out.println("버스가 달립니다");
	}
}
