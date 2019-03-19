package step06;

import step06_1.*;
import step06_2.*;  // * 는 패키지에 속하는 모든 클래스를 의미한다. 단 하위 패키지는 import 대상이 아님 
import step06_3.Engine;

public class Car8 {
	//필드
	Engine engine = new Engine();  // 다른 패키지에 속하는 클래스이지만 import를 했기 때문에 사용 가능하다 
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	step06_1.Tire tire3 = new step06_1.Tire();  // import를 하지 않을 경우 이런식으로 패키지명.클래스명 모두 기술하고 사용 가능 
	step06_2.Tire tire4 = new step06_2.Tire();

}
