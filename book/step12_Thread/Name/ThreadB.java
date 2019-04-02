package step12_Thread.Name;

public class ThreadB extends Thread { // 스레드 클래스 상속하는 클래스 ThreadB -> ThreadB도 스레드가 됨 
	public void run() { // 메소드 오버라이딩. threadB가 실행되는 내용 
		for(int i=0;i<2;i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
