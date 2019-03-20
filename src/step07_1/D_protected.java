package step07_1;
import step07.A_protected ;

public class D_protected extends A_protected{
	public D_protected() { //C와 달리 D는 A의 자식 클래스이기 때문에 A 클래스의 필드, 메소드, 생성자에 접근 가능
		// 단 new연산자로 생성자를 호출하는 것이 아니고 super()를 사용해서 생성자 호출 
		super(); // 부모 생성자 호출 
		this.field = "value";
		this.method();
	}
}
