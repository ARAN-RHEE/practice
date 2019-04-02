package step12_Thread.Control.Interrupt;

public class PrintThread extends Thread{
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); 
				// 스레드가 실행대기 또는 실행중일 때에 interrupt()가 실행되면
				// 예외가 발생하지 않음. 일시 정지 상태여야 예외 발생. 그래서 짧은시간이라도 정지시키기 위해
				// sleep에 파라미터 1밀리초를 줌. 
			}
		} catch (InterruptedException e) {
			
		}
		// while문이 종료되면 
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
