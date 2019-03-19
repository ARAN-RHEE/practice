package step06;

public class Car6 {
	//필드
	String model;
	int speed;
	
	//생성자
	Car6(String model) {   //생성자를 생략하지 않고 선언, 호출하는 이유는? 
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {  //리턴타입이 없는 run() 메소드. 
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i); 
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h )");
		}
	}
}
