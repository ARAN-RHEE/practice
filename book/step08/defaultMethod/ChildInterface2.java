package step08.defaultMethod;

public interface ChildInterface2 extends ParentInterface{
	@Override
	public default void method_2() {  //부모 인터페이스의 디폴트 메소드를 재정의 
		System.out.println("인터페이스2의 디폴트메소드 ");
	}
	
	public void method_3();
}
