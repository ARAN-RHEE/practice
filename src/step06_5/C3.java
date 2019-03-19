package step06_5;

import step06_4.*;

public class C3 {
	public C3() {
		A3 a = new A3();
		a.field1 = 1;
	//	a.field2 = 1; // 패키지가 다르므로 default 필드 접근 불가 
	//	a.field3 = 1; // private 필드 접근 불가 
		
		a.method1();
	//	a.method2();  // default 메소드 접근 불가 
	//	a.method3();  // private 메소드 접근 불가 
	}

}
