package step12_Thread.Control.Wait_Notify2;

public class DataBox {
		// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체 
		// 생성자 스레드는 소비자 스레드가 읽기 전에 새로운 데이터를 두번 생성해서는 안되고 
		// 소비자 스레드는 생성자 스레드가 새로운 데이터를 생성하기 이전에 데이터를 두번 읽어서도 안됨. 
		// 번갈아가면서 데이터생성 - 읽기, 데이터생성-읽기 가 실행되어야 함 
		// 데이터 저장할 수 있는 data필드의 값이 null이면 생산자 스레드를 실행 대기로, 소비자 스레드를 일시 정지시키고
		// data 필드의 값이 null이 아니면 소비자 스레드를 실행 대기 상태로, 생산자 스레드를 일시 정지상태로 만듦. 
	private String data;
	
	//동기화 메소드 선언 
	public synchronized String getData() {
		// data 필드가 null이면 소비자 스레드를 일시 정지시킴 
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
		// data필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듦 
		data = null;
		notify();
		
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		// data 필드가 null이 아니면
		if(this.data != null) {
			try { 
				wait(); // 생산자 스레드를 일시 정지 상태로 만듦 
			} catch (InterruptedException e) { }
		}
		// data 필드에 값을 저장하고
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify(); // 소비자 스레드를 실행 대기 상태로 만듦 
	}
}
