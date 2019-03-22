package step08.defaultMethod;

public interface ParentInterface {  //부모인터페이스 
	public void method_1();  // 부모인터페이스에서 추상메소드 선언 
	public default void method_2() {  // 부모인터페이스에서 디폴트메소드선언 
		System.out.println("디폴트 메소드");
	}
}
