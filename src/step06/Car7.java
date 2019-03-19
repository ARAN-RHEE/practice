package step06;

public class Car7 {

	int speed;     // 인스턴스 필드 
	
	void run() {
		System.out.println(speed + "으로 달립니다.");   
	}
	
	public static void main(String[] args) {
		Car7 myCar = new Car7();  // 외
		myCar.speed = 60;
		myCar.run();
	}
	

}
