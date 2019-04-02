package step12_Thread.State;

public class ThreadStateExample {

	public static void main(String[] args) {
		// StatePrintThread 를 생성해서 파라미터로 받은 TargetThread의 상태 출력 
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}

}
