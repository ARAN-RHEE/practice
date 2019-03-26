package step07.fieldExtends;

public class KumhoTire extends Tire{ //Tire를 상속하는 KumhoTire. Tire = 부모, KumhoTire = 자식 
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);  // 부모 클래스의 생성자 호출 
	}
	
	//메소드
	@Override // 출력 내용을 달리하기 위해 Override
	public boolean roll() {
		++ accumulatedRotation;  // 누적 회전수 1 증가 
		if(accumulatedRotation < maxRotation) { // 누적 회전수가 타이어 수명 범위 전일때 
			System.out.println(location + "KumhoTire 수명  : " +  
			(maxRotation - accumulatedRotation) + "회");  // 수명 - 누적 회전수. 즉 앞으로 수명까지 도달하기에 남은 회전 수 출력 
			return true; //true 리턴 
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");  
			// 누적 회전수가 타이어 수명을 다했을때 타이어의 위치와 펑크 출력
			return false; //false 리턴 
		}
	}
}


