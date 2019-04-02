package step12_Thread.Control.Wait_Notify;

public class WorkObject {
	// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체 
	// 동기화 메소드 선언 
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); // 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦. 
		try {
			wait(); // ThreadA를 일시 정지 상태로 만듦. 
		} catch (InterruptedException e) {
			
		}
	}
	
	
	public synchronized void methodB() { 
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify(); // 일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듦 
		try {
			wait(); // ThreadB를 일시 정지 상태로 만듦 
		} catch (InterruptedException e) {
			
		}
	}
}
