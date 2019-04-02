package step12_Thread.Control.Sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기 
		for(int i=0; i<10; i++) { // for문을 10번 반복시킴. 
			toolkit.beep(); // 비프음 발생. 즉 비프음 10번 발생시키는 for문 
			try {
				Thread.sleep(3000); // 3초간 일시 정지 상태. 3초 주기로 beep음을 10번 발생시키게 됨 
			} catch (Exception e) { }
		}
		// 메인 스레드는 3초간 일시 정지하고 다시 실행된다. 
	}

}
