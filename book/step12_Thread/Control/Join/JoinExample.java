package step12_Thread.Control.Join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread(); // SumThread 객체를 생성하고 스레드 실행 
		sumThread.start();
	
		// 메인 스레드는 sumThread가 계산 작업을 모두 마칠 때까지 일시 정지 상태에 있다가 
		// SumThread가 최종 계산된 결과값을 산출하고 종료하면 결과값을 받아 출력함 
		try {
			sumThread.join(); // sumThread가 종료할 때까지 메인 스레드 일시 정지 
		} catch (InterruptedException e) {
			
		}   // try-catch 문이 없다면 합계를 구하기 전에 메인메소드가 먼저 출력을 끝내버려서 정확한 합계가 나오지 않음 
		System.out.println("1~100 합 : " + sumThread.getSum());
	}

}
