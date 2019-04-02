package step12_Thread.Rank;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name); // 스레드 이름 변경 
	}
	
	public void run() {
		// 스레드가 실행할 내용.
		// 20억번의 루핑을 끝낸 뒤 스레드 이름 출력 
		for(int i=0; i<2000000000; i++) {
		}
		
		System.out.println(getName());
	}
}
