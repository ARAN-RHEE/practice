package step12_Thread.SharingObject;

public class Calculator { // 공유 객체 
	// 필드 선언. private로 접근제한자 설정했으므로 getter setter 메소드로 접근 
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) { // 계산기 메모리에 값 저장하는 메소드 
		this.memory = memory; // 파라미터값을 memory  필드에 저장 
		try { // 스레드를 2초간 일시 정지시킴 
			Thread.sleep(2000);
		} catch (InterruptedException e) { }
		System.out.println(Thread.currentThread().getName()+": "+this.memory); // 스레드이름 + 메모리 값 출력 
	}
}
