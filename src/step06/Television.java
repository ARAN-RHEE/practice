package step06;

public class Television {
	// 필드 값을 static 선언 
	static String company = "Samsung";  
	static String model = "LCD";
	static String info;   // 위 두 필드값과 다르게 기본 초기값이 없었음 
	  
	static { // 이렇게 사용하는 이유는..? 정적 필드는 객체 생성없이 사용해야 하므로 생성자에서 초기화 할 수 없기 떄문. 
		// 생성자는 객체 생성 시에만 실행되기 때문이다. 
		info = company + "-" + model;  // 정적 블록에서 company와 model 필드값을 서로 연결해서 초기값으로 설정.
	}
}
