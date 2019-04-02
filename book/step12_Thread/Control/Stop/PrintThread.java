package step12_Thread.Control.Stop;

public class PrintThread extends Thread{
	private boolean stop; // 스탑 플래그를 필드에 선언 
	
	public void setStop (boolean stop) {
		this.stop = stop; // 필드에 stop 넣어줌 
	}
	
	public void run() {
		while(!stop) { // stop이 true가 아닐 때
			System.out.println("실행 중");  // while문 계속 실행중 
		}
		//stop이 true가 될때 -> while문을 빠져나왔을 때 
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
