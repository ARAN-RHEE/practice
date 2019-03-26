package step08.abstractMethod;

public class RemoteControlExample { //추상 메소드 실행하기 
	public static void main(String[] args) {
		
		RemoteControl rc = null;  //인터페이스 변수 선언 
		
		rc = new Television();  // 구현 객체가 Television. Television 객체를 인터페이스 타입에 대입 
		rc.turnOn(); // 실제 실행되는 메소드는 구현 객체의 메소드 
		rc.turnOff(); // 실제 실행되는 메소드는 구현 객체의 메소드 
		
		rc = new Audio();  // 구현 객체가 Audio. Audio객체를 인터페이스 타입에 대입 
		rc.turnOn();// 실제 실행되는 메소드는 구현 객체의 메소드 
		rc.turnOff();// 실제 실행되는 메소드는 구현 객체의 메소드 
	}
}
