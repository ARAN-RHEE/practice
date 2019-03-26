package step06;

public class Car5Example {

	public static void main(String[] args) {
	 Car5 myCar = new Car5();
	 myCar.keyTurnOn(); // 리턴타입이 없는 메소드 호출
	 myCar.run(); // 리턴타입이 없는 메소드 호출 
	 int speed = myCar.getSpeed();  // getSpeed 의 경우 int 타입을 리턴하기때문에 변수에 담아줌 
	 System.out.println("현재 속도 : " + speed + "km/h");
	}

}
