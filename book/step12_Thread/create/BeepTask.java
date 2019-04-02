package step12_Thread.create;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		// 스레드 실행 내용. Runnable 인터페이스에 구현되어있는 run()메소드 오버라이딩
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 비프음 발생 
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
