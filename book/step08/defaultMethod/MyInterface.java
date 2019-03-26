package step08.defaultMethod;

public interface MyInterface {
	public void methodA();//추상메소드 선언
	
	public default void methodB() {  // 디폴트 메소드 선언. 
		System.out.println("MyInterface-methodB 실행");
	}
}
