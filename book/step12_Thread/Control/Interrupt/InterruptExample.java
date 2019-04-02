package step12_Thread.Control.Interrupt;

public class InterruptExample {
	//1초 후 출력 스레드를 중지시킴 

	public static void main(String[] args) {
		Thread thread = new PrintThread(); // 스레드 객체 생성 
		thread.start(); // 스레드 실행 
		
		try { 
			Thread.sleep(1000);// 메인스레드 1초 일시 정지 
		} catch (InterruptedException e) { }
		
		thread.interrupt(); // 스레드를 종료시키기 위해 InterruptedException을 발생시킴 
	}

}
