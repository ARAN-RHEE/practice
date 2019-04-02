package step12_Thread.SharingObject;

public class User1 extends Thread{
	private Calculator calculator; // 필드 선언 
	 

	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // 스레드 이름 User1 로 설정 
		this.calculator = calculator; // 공유 객체인 Calculator를 필드에 저장 
	}
	
	public void run() { // 공유 객체인 Calculator 의 메모리에 100 저장 
		calculator.setMemory(100);
	}
}
