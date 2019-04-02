package step12_Thread.Control.Wait_Notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); // 공유 객체 생성
		
		// 스레드 A, B 생성 
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		//스레드 A,B 실행 
		threadA.start();
		threadB.start();

	}

}
