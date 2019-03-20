package step07.fieldExtends;
//tire를 부품으로 가지는 클래스 
public class Car {
	//필드. 자동차는 4개의 바퀴를 가진다. 
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);

	
	//생성자
	//생략
	
	
	//메소드. 모든 타이어를 1회 회전시키기 위해 Tire객체의 roll() 메소드를 호출. false를 리턴하는 경우 stop()메소드를 호출하고 해당 타이어 번호 리턴
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		
		return 0; //stop() 메소드를 호출하지 않음. 바퀴 수명이 모두 살아 있으면 0 리턴 
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
