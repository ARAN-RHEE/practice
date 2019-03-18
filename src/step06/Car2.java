package step06;

public class Car2 {
	//필드
	String company = "현대자동차";  //필드에서 객체 초기화 
	String model;
	String color;
	int maxSpeed;
	
	Car2() {
		//기본 생성자. 생략 가능.
	}

	Car2(String model){  //생성자 오버로딩 
		this.model = model;
	}
	
	Car2(String model, String color) { //생성자 오버로딩 
		this.model = model;
		this.color = color;
	}

	Car2(String model, String color, int maxSpeed) { //생성자 오버로딩 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}

