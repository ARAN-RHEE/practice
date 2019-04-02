package step12_Thread.Control.Interrupt;

public class PrintThread2 extends Thread{
	// 일시정지 코드 없이 while문 빠져나가기. interrupted()
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				// interrupt()가 호출되었다면 스레드의 interrupted()와 isInterrupted()는 true를 리턴함. 
				// interrupt()가 호출되었다면 true이므로 아래 break를 타고, while문을 빠져나감
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
