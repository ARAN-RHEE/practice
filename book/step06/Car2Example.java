package step06;

public class Car2Example {

	public static void main(String[] args) {
		//Car2 생성자를 오버로딩해서 다양한 방법으로 Car2 객체 생성 
		Car2 car = new Car2();
		System.out.println("car.company " + car.company);
		System.out.println();
		
		Car2 car1 = new Car2("택시", "검정", 200); 
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println();
		
		Car2 car2 = new Car2("자가용");
		System.out.println("car2.company " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("자가용","빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
	}

}
