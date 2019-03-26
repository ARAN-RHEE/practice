package step08.defaultMethod;

public class MyClassA implements MyInterface{  // MyInterface 인터페이스를 이용하는 클래스 
	@Override
	public void methodA() {  // 인터페이스의 메소드를 클래스에서 오버라이딩 
		System.out.println("MyClassA-methodA 실행");
	}
}
