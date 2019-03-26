package step06_5;

import step06_4.*;

public class C {

	//A a; // 06_4 패키지를 import 했음에도 A 클래스에 접근할 수 없는 이유는 default 접근 제한을 했기 때문 
	B b; // B 클래스는 public이고 import를 했기 때문에 접근 가능하다. C클래스에서 B클래스를 이용하여 필드 선언 및 생성자/메소드 내부에서 
	// 변수 선언이 가능하다. 
	
}
