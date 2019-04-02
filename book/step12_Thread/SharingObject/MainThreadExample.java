package step12_Thread.SharingObject;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();  // Calculator 공유 객체 생성 
		
		User1 user1 = new User1(); // User1 스레드 객체 생성 
		user1.setCalculator(calculator); // 공유 객체 설정 
		user1.start();// 스레드 실행 
		
		User2 user2 = new User2(); // User2 스레드 객체 생성
		user2.setCalculator(calculator); // 공유 객체 설정
		user2.start(); // 스레드 실행 
		
		//User1스레드가 Calculator 객체의 memory필드에 100을 먼저 저장하고 2초간 일시 정지.
		// 그 사이에 User2스레드가 memory 필드값을 50으로 변경.
		// 2초 뒤 다시 User1스레드가 실행되면 변경된 값이 나옴 
	}

}
