package step06;

public class Car1Example {

	public static void main(String[] args) {
	// Car1 클래스에 생성자를 선언했으므로 기본생성자 Car1()를 호출해서 객체생성 안됨
	// Car1(String color, int cc)를 호출해서 객체 생성. 
		Car1 myCar = new Car1("검정", 3000);
		//Car1 myCar = new Car1()  불가능. 생성자 안에 파라미터가 있기 때문. 

	}

}
