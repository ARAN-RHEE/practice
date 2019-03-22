package step08.defaultMethod;

public class RemoteControlExample { //디폴트 메소드 실행하기 
	public static void main(String[] args) {
		
		RemoteControl rc = null;  //인터페이스 변수 선언 
		
		rc = new Television();  // 구현 객체가 Television. Television 객체를 인터페이스 타입에 대입 
		rc.turnOn(); // 실제 실행되는 메소드는 구현 객체의 메소드 
		rc.setMute(true); // setMute()메소드는 디폴트 메소드로 인터페이스에 있던 setMute가 실행됨  
		
		rc = new Audio();  // 구현 객체가 Audio. Audio객체를 인터페이스 타입에 대입 
		rc.turnOn();// 실제 실행되는 메소드는 구현 객체의 메소드 
		rc.setMute(true);// Audio 클래스에서 디폴트 메소드를 재정의했으므로, 자식 클래스에 있던 메소드가 실행됨. 
		
	
	}
}
