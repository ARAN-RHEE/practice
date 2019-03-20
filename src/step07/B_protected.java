package step07;

public class B_protected {
	// B 클래스는 A 클래스와 동일한  패키지에 있음. protected 접근 제한은 같은 패키지 내이면 사용 가능함 

	public void method() {
		A_protected a = new A_protected();  // A 클래스의 필드와 메소드에 접근하기 위해 객체 생성 
		a.field = "value"; 
		a.method();
	}
}
