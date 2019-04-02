package step12_Thread.create;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new BeepTask(); // 비프음 발생하는 클래스의 객체 생성
		Thread thread = new Thread(beepTask); // 작업 스레드 생성. Thread 클래스로부터 직접 생성하는 방법임.
		thread.start(); // 작업 스레드 시작

		/*
		 * 방법2. Runnable 익명 객체 이용 
		 * Thread thread = new Thread(new Runnable()) {
		 *
		 * @Override 
		 * public void run(){ 
		 * 		Toolkit toolkit = Toolkit.getDefaultToolkit();
		 * 		for(int i=0;i<5;i++){ 
		 * 			toolkit.beep(); 
		 *			try{ 
		 *				Thread.sleep(500); 
		 *			} catch (Exception e){ }
		 *			 }
		 *		 } 인터페이스 구현 클래스를 만들 필요가 없어짐
		 *	});
		 */

		/*
		 * 방법3. 람다식 이용 (람다식은 뒤에 나오는 내용) 
		 * Thread thread = new Thread())-> {
		 * @Override 
		 * 	public void run(){
		 * 		Toolkit toolkit = Toolkit.getDefaultToolkit();
		 * 		for(int i=0;i<5;i++){
		 * 			 toolkit.beep();
		 * 			 } try { 
		 * 				Thread.sleep(500);
		 * 			 }	catch(Exception e) { } } }
		 */

		for (int i = 0; i < 5; i++) { // 메인스레드는 for문을 실행시키고 작업스레드는 위에 비프음 발생하는 작업을 하므로 동시에 수행가능
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
