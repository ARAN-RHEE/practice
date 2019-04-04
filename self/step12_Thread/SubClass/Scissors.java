package step12_Thread.SubClass;

public class Scissors extends Thread { // 스레드의 하위 클래스로  작업 스레드 생성 
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				// 스레드 실행할때마다 0.1초 정지 
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("가위");
		}
	}
}
