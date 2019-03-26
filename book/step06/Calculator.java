package step06;

public class Calculator {
	 //생성자명이 생략되어 있다. 
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");  //전원만 키면 되기 때문에 매개변수가 필요 없음 
	}
	
	int plus (int x, int y) {
		int result = x + y;
		return result;    // 리턴타입이 int 이므로 result는 int 
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;  //double로 형변환 해주는 이유는 파라미터 x,y가 int 타입으로 들어갔기 때문에
		return result;							//형변환 하지 않고 계산 시에 int 타입이 출력되기 때문이다 - 타입 맞춰줌 
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
