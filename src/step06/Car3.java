package step06;

public class Car3 {
	//필드
	String company = "현대자동차";  //필드에서 객체 초기화 
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car3(){  // 생략 가능한 기본 생성자 
	}
	
	Car3(String model){   //호출 
		this(model, "은색", 250);
	}
	
	Car3(String model, String color) {  //호출 
		this(model, color, 250);
	}
	
	Car3(String model, String color, int maxSpeed) {  // 대입 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;   //공통 실행 코드 
	}
	
}
