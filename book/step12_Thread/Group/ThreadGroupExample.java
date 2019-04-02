package step12_Thread.Group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		// 스레드 그룹 myGroup에 workThreadA, workThreadB 두 스레드를 포함시킴 
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		//스레드 실행 
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup(); //현재 스레드의 그룹이름 가져오기 
		mainGroup.list(); 
		// list() -> 현재 스레드 그룹 이름과 최대 우선순위를 헤더로 출력하고 
		// 그 아래에 현재 스레드 그룹에 포함된 스레드와 하위 스레드 그룹의 내용을 보여줌 
		System.out.println();
		
		try {
			Thread.sleep(3000); // 메인 스레드 3초 일시정지 
		} catch (InterruptedException e) { }
		
		System.out.println("[myGroup 스레드 그룹의 interrupt() 메소드 호출]");
		myGroup.interrupt(); // 3초 뒤 예외 발생해서 while문 빠져나가고 스레드 종료 
	}

}
