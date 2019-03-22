package step08.Inheritance;

public class ImplementationC implements InterfaceC{
	public void methodA() {  // 부모 인터페이스인 인터페이스A와 B의 실체 메소드가 있어야한다.
		System.out.println("Imple-methodA() 실행");
	}  
	
	public void methodB() {
		System.out.println("Imple-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("Imple-methodC() 실행");
	}
}
