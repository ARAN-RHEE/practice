package step12_Thread.State;

public class TargetThread extends Thread{ //타겟 스레드 클래스 
	public void run() {
		// 10억번 루핑을 돌게해서 Runnable 상태를 유지 
		for(long i=0; i<2000000000; i++) { 	}
		
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500); // 일시 정지 상태 1.5초간 유지 Timed_waiting
		} catch (Exception e) { }
	
	
	for(long i=0; i<1000000000; i++) { }	// 다시 10억번 루핑 돌게 해서 Runnable 상태 유지 
	}

}
 