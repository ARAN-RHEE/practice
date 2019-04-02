package step12_Thread.create.SubClass;

public class BeepPrintExample {

	public static void main(String[] args) { // 메인 스레드 
		Thread thread = new BeepThread(); // BeepThread 객체 생성 
		thread.start(); // BeepThread 스레드 실행 
		
		/* 작업 스레드를 만드는 또 다른 방법 
		 * Toolkit toolkit = Toolkit.getDefaultToolkit();
		 * for(int i=0; i<5; i++){
		 * toolkit.beep();
		 * try { 
		 * 	Thread.sleep(500);
		 * 	} catch (Exception e) { }
		 * }
		 * }
		 * };
		 * 
		 * */
		
		for(int i=0; i<5; i++) { // 작업 스레드는 비프음을 발생시키고, 메인스레드는 띵띵 출력 
			System.out.println("띵");
			try { Thread.sleep(500);
			} catch (Exception e) { }
		}
	}
}

