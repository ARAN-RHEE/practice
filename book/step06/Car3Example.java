package step06;

public class Car3Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car = new Car3();  //기본 생성자로 객체 생성
		System.out.println("car.company : " + car.company);
		System.out.println();
		
		Car3 car1 = new Car3("자가용");
		System.out.println("car1.company " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println();
		
		Car3 car2 = new Car3("자가용","빨강");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		
		Car3 car3 = new Car3("택시","검정",200);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
		
	}

}
