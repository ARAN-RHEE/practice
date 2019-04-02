package step12_Thread.create;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기 
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 비프음 발생 
			try {
				Thread.sleep(500); // 0.5초간 일시 정지 
			} catch (Exception e) {
				
			}
		}
			
			
			for(int i=0; i<5; i++) {
				System.out.println("띵");  // 띵 프린팅 
			try {
				Thread.sleep(500); // 0.5초간 일시 정지 
			} catch(Exception e) {
				
			}
		}
			// 비프음 발생과 프린팅은 서로 다른 작업이므로 메인스레드가 동시에 두가지 작업을 하지 못함.
			// 메인 스레드는 비프음을 모두 발생한 다음 프린팅을 시작함 

	}

}
