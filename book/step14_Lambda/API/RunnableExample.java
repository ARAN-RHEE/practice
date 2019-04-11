package step14_Lambda.API;

public class RunnableExample {

	public static void main(String[] args) {
		// 람다식 (스레드가 실행하는 코드) 
		Runnable runnable = ()->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		
		// 스레드 객체 생성 후 파라미터로 Runnable인터페이스 객체 대입 
		Thread thread = new Thread(runnable);
		thread.start();
		

	}

}
