package step06_4;

public class A3 {
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A3() {
		field1=1;  //초기화. 클래스 내부일 경우 접근 제한자의 영향을 받지 않음. 
		field2=1;
		field3=1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {
	}
	void method2() {  // default
	}
	private void method3() {
	}
	
	// 자기 자신 클래스 내부에서는 접근제한자의 영향을 받지 않는다. 
}