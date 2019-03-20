package step07.fieldExtends;
//부모 클래스, 자식 클래스와의 다형성 
public class Tire {
	//필드
	public int maxRotation;  //최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어의 위치 
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {  // roll() 메소드 호출 시 
		++ accumulatedRotation;  // 누적 회전수 1 증가 
		if(accumulatedRotation < maxRotation) { // 누적 회전수가 타이어 수명 범위 전일때 
			System.out.println(location + "Tire 수명  : " +  
			(maxRotation - accumulatedRotation) + "회");  // 수명 - 누적 회전수. 즉 앞으로 수명까지 도달하기에 남은 회전 수 출력 
			return true; //true 리턴 
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");  
			// 누적 회전수가 타이어 수명을 다했을때 타이어의 위치와 펑크 출력
			return false; //false 리턴 
		}
	}

}
