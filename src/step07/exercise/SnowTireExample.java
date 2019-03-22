package step07.exercise;

public class SnowTireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowTire = new SnowTire();
		Tire tire = new Tire();
		
		snowTire.run();  // 부모 클래스의 메소드를 오버라이딩 했기 때문에 재정의 한 자식 클래스의 메소드가 실행됨 
		tire.run(); // 부모 클래스는 자식 클래스에서 오버라이딩 해도 영향을 받지 않기 때문에 부모클래스 자신의 메소드가 실행됨.
	}

}
