package step09.Exercise;

public class NestedClassExample {  // 멤버 클래스의 객체를 생성하는 코드 작성하기 

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine(); // Engine 클래스는 static이므로 바깥 클래스의 객체를 생성할 필요가 없음 . 

	}

}
