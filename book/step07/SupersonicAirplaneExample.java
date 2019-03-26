package step07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane_super sa = new SupersonicAirplane_super();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane_super.SUPERSONIC;  //flyMode가 SUPERSONIC 상수값을 가질 때 
		//오버라이딩 한 메소드를 사용하지만 
		sa.fly();
		sa.flyMode = SupersonicAirplane_super.NORMAL;
		// NORMAL 상수값을 가질 경우 부모 클래스의 메소드를 사용한다. 
		sa.fly();
		sa.land();
	}

}
