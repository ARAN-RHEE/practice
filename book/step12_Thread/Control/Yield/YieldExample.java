package step12_Thread.Control.Yield;

public class YieldExample {
	public static void main(String[] args) {
		// 스레드 객체 생성 
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		// 스레드 A, B 모두 실행 시작시킴 
		threadA.start();
		threadB.start();
		
		try { 
			Thread.sleep(3000); // 3초 일시 정지 하고 
		} catch (InterruptedException e) { }
		threadA.work = false; // 스레드 A false-> 스레드 양보됨 
		
		try {
			Thread.sleep(3000); // 3초 일시 정지 하고 
		} catch (InterruptedException e) { }
		threadA.work = true; // 스레드 A, B 모두 실행 
		
		try { 
			Thread.sleep(3000); // 3초 일시 정지 하고 
		} catch (InterruptedException e) { }
		threadA.stop = true; // 스레드 A, B 모두 종료시킴 
		threadB.stop = true;
	}
}
