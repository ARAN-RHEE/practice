package step07.fieldExtends;
//실행 클래스 
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // Car 객체 생성
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); //run 메소드는 펑크난 바퀴의 위치를 리턴함 
		  // Car 객체의 run()메소드 5번 실행

		switch(problemLocation) {
		case 1 : // 앞 왼쪽 바퀴가 펑크나면 case1 
			System.out.println("앞 왼쪽 HankookTire로 교체");
			car.frontLeftTire = new HankookTire("앞왼쪽", 15);
			break;
		case 2 :// 뒤 왼쪽 바퀴가 펑크나면 case2
			System.out.println("앞 오른쪽 KumhoTire로 교체");
			car.frontRightTire = new KumhoTire("앞오른쪽", 13);
			break;
		case 3 :// 뒤 왼쪽 바퀴가 펑크나면 case3 
			System.out.println("뒤 왼쪽 HankookTire로 교체");
			car.backLeftTire = new HankookTire("앞왼쪽", 14);
			break;
		case 4 :// 뒤 오른쪽 바퀴가 펑크나면 case4 
			System.out.println("앞 왼쪽 HankookTire로 교체");
			car.backRightTire = new KumhoTire("앞왼쪽", 17);
			break;
		
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); //1회전시 출력되는 내용 구분
		
		}
// 바퀴가 펑크나면 자식 클래스(바퀴 부품)의 객체로 교체하고 교체된 이후 부터는 자식 클래스에서 오버라이딩 된 메소드가 실행된다. 
	}
}
