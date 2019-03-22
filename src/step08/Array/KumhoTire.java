package step08.Array;

public class KumhoTire implements Tire{
	@Override
	public void roll() { // 인터페이스 메소드를 구현 클래스에서 재정의 
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
