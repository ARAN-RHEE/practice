package step08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스로 구현 객체를 사용하려면 인터페이스 변수를 선언하고 
		RemoteControl rc;
		// 구현 객체를 변수에 대입해주어야 한다. 인터페이스 변수는 참조 타입이라서
		// 구현 객체가 대입될 때 변수에는 구현 객체의 번지를 저장한다. 
		rc = new Television();
		rc = new Audio();
	}

}
