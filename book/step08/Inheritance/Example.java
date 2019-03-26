package step08.Inheritance;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC(); //ImplC메소드를 사용하기 위해 객체 생성 
		
		InterfaceA ia = impl;  // impl 변수에 InterfaceA 인터페이스 타입 참조 
		ia.methodA(); // InterfaceA의 메소드 실행 
		System.out.println();
	
		InterfaceB ib = impl; // impl 변수에 InterfaceB 인터페이스 타입 참조 
		ib.methodB(); // InterfaceB의 메소드 실행 
		System.out.println();
		
		InterfaceC ic = impl;  // impl 변수에 InterfaceC 인터페이스 타입 참조 
		ic.methodA();  // 인터페이스C는 인터페이스 A,B를 다중 상속 받으므로 A,B에 있는 메소드 사용 가능 . 
		ic.methodB();
		ic.methodC();

	}

}
