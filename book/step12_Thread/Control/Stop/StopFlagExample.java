package step12_Thread.Control.Stop;

public class StopFlagExample {

	public static void main(String[] args) {
		// 스레드 객체 생성 
		PrintThread printThread = new PrintThread();
		printThread.start(); // 스레드 실행 
		
		try {
			Thread.sleep(1000); // 스레드를 실행하고 1초 뒤에 일시 정지 
		} catch (InterruptedException e) {
			
		}
		// 스레드를 종료시키기 위해 stop필드를 true로 변경
		printThread.setStop(true);

	}

}
