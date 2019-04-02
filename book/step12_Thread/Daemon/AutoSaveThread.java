package step12_Thread.Daemon;

public class AutoSaveThread extends Thread {
	//1초 주기로 save()메소드를 호출하는 데몬 스레드
	
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); // 1초 일시 정지 
			} catch(InterruptedException e) {
				break; // 예외 발생하면 break;
			}
			
			save(); // 위에서 오버라이딩 한 메소드임 
		}
	}

}
