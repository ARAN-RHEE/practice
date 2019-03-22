package step08;

public interface RemoteControl {  // 인터페이스 키워드 붙음 
	public int MAX_VOLUME = 10; // 인터페이스에서는 변수 선언 불가. 변수처럼 보이지만 상수이고 
	public int MIN_VOLUME = 0;
	// 모든 상수는 public static final 특성을 갖는데, 키워드를 생략하더라도  컴파일 과정에서 자동으로 붙음 
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);  //추상 메소드는 리턴타입 메소드명만 작성하고 실행부분 { } 는 작성하지 않음 
	// 인터페이스를 통해 호출한 메소드는 최종적으로 객체에서 실행되기 때문 - 오버라이딩 
	
	//디폴트 메소드. 자바버전8에서 추가되었고 형태는 클래스의 인스턴스 메소드와 동일하지만 앞에 default 키워드가 붙는다.
	// default 메소드는 public 특성을 가지므로 public을 생략하더라도 컴파일 과정에서 자동으로 붙는다  public default 리턴타입 메소드명  
	default void setMute(boolean mute) { // 추상메소드와 다르게 실행 내용 { } 까지 작성한다. 
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	static void changeBattery() { 
		// 정적 메소드는 public 특성을 가지므로 public을 생략하더라도 컴파일 과정에서 자동으로 붙는다  public static 리턴타입 메소드명 
		System.out.println("건전지를 교환합니다.");
	}
}
