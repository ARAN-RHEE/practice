package step07_1;
import step07.A_protected;
 // A, B와 다른 패키지 
public class C_protected {
	public void method() {
		A_protected a = new A_protected();  // 패키지가 다르기 때문에 오류남 
		a.field = "value";
		a.method();
	}
}
