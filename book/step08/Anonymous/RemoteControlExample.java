package step08.Anonymous;

public class RemoteControlExample {  //익명 구현 객체 연습하기 

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() { // 인터페이스 변수 = new 인터페이스 { 추상메소드 실행문까지 - 실체 메소드 선언 } ;
			public void turnOn() {
				//실행문
			}
			public void turnOff() {
				//실행문
			}
			public void setVolume(int volume) {
				//실행문
			}
		};  // 하나의 실행문이므로 끝에 세미콜론 붙여줌 

	}

}
