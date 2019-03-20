package step07;

public class Computer_Overriding extends Calculator_Overriding {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r; // 좀더 정밀하게 계산하기 위해 Math클래스의 PI 상수 이용 
	}
}
