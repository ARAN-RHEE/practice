package step06;

public class Car5 {
	//필드
	int speed;  //초기값을 따로 넣어주진 않았으나 0으로 초기화 되어있음(기본값)
	
	//생성자. 생략됨
	
	//메소드
	int getSpeed() {   // 리턴타입이 int타입인 메소드 
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");  //리턴타입이 없는 메소드. 단순 출력용 
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {  //i+=10은 10씩 증가
			speed = i; // i값을 speed에 대입 
			System.out.println("달립니다. (시속 : " + speed + "km/h" + ")");
		}
	}
}
