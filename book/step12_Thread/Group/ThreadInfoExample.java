package step12_Thread.Group;

import java.util.Map;
import java.util.Set;

import step12_Thread.Daemon.AutoSaveThread;

public class ThreadInfoExample {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // 스레드 객체 생성 
		autoSaveThread.setName("AutoSaveThread"); // 스레드 이름 부여 
		autoSaveThread.setDaemon(true); // AutoSaveThread는 메인 스레드의 데몬스레드 
		autoSaveThread.start(); // AutoSaveThread 실행 
		
		// 15장에 Map, Set 배움. 
		// 프로세스에서 실행하는 모든 Thread를 가져오는 코드 
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread thread : threads) { // Thread를 하나씩 가져와 루핑시킴 
			System.out.println("Name : " + thread.getName() + 
					((thread.isDaemon())?"(데몬)" : "(주)")); 
					// thread가 데몬이면 (데몬), 아니면 (주) 출력 
			System.out.println("\t"+"소속그룹 : "+thread.getThreadGroup().getName()); // 스레드 그룹의 이름 가져오기 
			System.out.println();
		}

	}

}
