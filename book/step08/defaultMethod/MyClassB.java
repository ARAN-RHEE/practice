package step08.defaultMethod;

public class MyClassB implements MyInterface{
	@Override
	public void methodA() { // 인터페이스의 추상 메소드 오버라이딩 
		System.out.println("MyClassB-methodA() 실행");
	}
	
	@Override
	public void methodB() {
		System.out.println("MyClassB-methodB() 실행"); // 디폴트 메소드 오버라이딩 
	}

}
