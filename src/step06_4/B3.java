package step06_4; // A3 클래스와 같은 패키지 

public class B3 {
	public B3() {
		A3 a = new A3(); // A3의 메소드, 필드에 접근하기 위해 객체 생성 
		a.field1 = 1;
		a.field2 = 1;
	//	a.field3 = 1;   //private 필드 접근 불가 
		
		a.method1();
		a.method2();
	//	a.method3(); // private 메소드 접근 불가 
	}
}
