package step07.fieldExtends;

public class Taxi extends Vehicle{ //Taxi 클래스는 Vehicle클래스의 자식 클래스 
	@Override
	public void run() {  //run()메소드 오버라이딩. 재정의. 
		System.out.println("택시가 달립니다.");
	}

}
