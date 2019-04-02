package step12_Thread.Control.Wait_Notify2;

public class WaitNotifyExample {
	// 두 스레드를 생성하고 실행하는 메인 메소드 
	
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		// 스레드 생성 후 파라미터로 공유 객체 넣어줌 
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();

	}

}
