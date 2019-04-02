package step12_Thread.Control.Wait_Notify;

public class ThreadB extends Thread {
	// WorkObject의 methodB()를 실행하는 스레드
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {
		this.workObject = workObject; // 공유 객체를 매개값으로 받아 필드에 저장 
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB();  // 공유 객체의 methodB()를 10번 반복 호출 
		}
	}
}
