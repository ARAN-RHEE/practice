package step08.promotion;

public class HankookTire implements Tire{  // Tire 인터페이스를 사용하는 클래스 
	@Override
	public void roll() {  // 인터페이스 내 추상 클래스를 재정의 
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
