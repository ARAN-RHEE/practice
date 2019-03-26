package step08.defaultMethod;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi1 = new MyClassA();
		mi1.methodA();	// MyClassA에서 재정의 된 메소드 실행 
		mi1.methodB();  // MyClassA에서 재정의되지 않은 디폴트메소드이므로 인터페이스의 디폴트메소드가 실행됨 
		
		MyInterface mi2 = new MyClassB();
		mi2.methodA(); // MyClassB에서 재정의 된 메소드 실행 
		mi2.methodB(); // MyClassB에서 재정의 된 디폴트 메소드 실행 
	}

}
