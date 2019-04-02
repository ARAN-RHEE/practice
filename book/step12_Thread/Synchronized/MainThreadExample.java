package step12_Thread.Synchronized;

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
		// setMemory()를 실행하는 순간 객체 잠금. 
		// User2가 스레드를 실행시키지만 동기화 메소드인 setMemory()를 실행시키지못하고 끝날때까지 대기 
		// User1이 Calculator 객체를 사용할 동안 User2는 Calculator객체를 사용하지 못하므로 안전하게 방해없이 사용 가능 
		
	}

}
