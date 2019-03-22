package step08.Array;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();  // Car 클래스의 메소드를 사용하기 위해 객체 생성
		
		myCar.run();  // 필드값에 Tire 객체를 HankookTire를 참조하게 함 - 자동 타입 변환 
		
		myCar.tires[0] = new KumhoTire();  // 바퀴를 배열로 담았으므로 배열의 0번, 앞왼 바퀴를 금호타이어로 교체  
		myCar.tires[1] = new KumhoTire(); // 바퀴를 배열로 담았으므로 배열의 1번, 앞오 바퀴를 금호타이어로 교체  
		
		myCar.run();  // 금호타이어 객체로 교체된 뒤에는 Car의 run()메소드를 수정하지 않아도 KumhoTire()의 roll()메소드가 호출된다. 
	}
}
