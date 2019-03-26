package step08.defaultMethod;

public interface ChildInterface3 extends ParentInterface{
	@Override
	public void method_2(); // 부모의 디폴트메소드를 자식인터페이스의 추상 메소드로 재선언
	public void method_3();

}
