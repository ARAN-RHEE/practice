package step12_Thread.Control.Yield;

public class ThreadB extends Thread{
	public boolean stop = false; // 종료 플래그
	public boolean work = true;	// 작업 진행 여부 플래그 
	
	public void run() {
		while(!stop) { // stop이 true가 되면 while문 종료 
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield(); // work가 false가 되면 다른 스레드에게 실행 양보 
			}
		}
		// while문 종료시 스레드 종료됨 
		System.out.println("ThreadB 종료");
	}
}

