package step12_Thread.Daemon;

public class DaemonExample {

	public static void main(String[] args) {
		// 메인 스레드가 실행하는 코드 
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // 스레드 객체 생성 
		autoSaveThread.setDaemon(true); // AutoSaveThread를 메인스레드의 데몬스레드로 만듦 
		autoSaveThread.start(); // 데몬스레드 실행 
		
		try {
			Thread.sleep(3000); // 메인스레드 3초간 일시 정지 
		} catch (InterruptedException e) {
			
		}
		// 메인스레드 3초 정지 후 종료시킴. 데몬스레드도 같이 종료됨 
		System.out.println("메인 스레드 종료");

	}

}
