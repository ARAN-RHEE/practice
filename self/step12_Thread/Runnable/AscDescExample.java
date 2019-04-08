package step12_Thread.Runnable;

public class AscDescExample {
	// 스레드 만들때 스레드클래스에서 상속받지 않고 Runnable 인터페이스 사용하기
	// Runnable인터페이스 사용 시 장점은 다른 클래스를 상속받을 수 있다는 것.
	// 자바는 다중상속이 불가능하므로 Thread 클래스를 상속받으면 다른 클래스를 상속받을 수 없음.
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Asc());
		Thread thread2 = new Thread(new Desc());
		thread1.start();
		thread2.start();
	}

}
