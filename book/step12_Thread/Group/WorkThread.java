package step12_Thread.Group;

public class WorkThread extends Thread {
	 // InterruptedException이 발생할때 스레드 종료하기 
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); // 스레드 그룹과 이름설정 
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); // 스레드 1초 일시정지 
			} catch (InterruptedException e) {
				// 예외 발생할 때 while문 빠져나와 스레드 종료시킴 
				System.out.println(getName() + "interrupted");
				break;
			}
		}
		
		System.out.println(getName()+"종료됨");
	}
}
