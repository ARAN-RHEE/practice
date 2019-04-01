package step08_Interface;

public class MartExample {

	public static void main(String[] args) {
		
		// 객체 생성 후 파라미터에 값 넣어줌 
		HomePlus hp = new HomePlus(30);
		LotteMart lm = new LotteMart(70);
		
		
		//객체에 맞는 오버라이딩 한 메소드 실행 
		hp.income();
		lm.income();

	}

}
