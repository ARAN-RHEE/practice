package step07.abs;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone phone = new Phone(); //추상클래스 이기 때문에 new 연산자를 사용해서 Phone 객체를 생성할 수 없음 
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();  //Phone의 메소드. 상속받은 부모 클래스의 메소드를 사용할 수 있음 
		smartPhone.internetSearch();
		smartPhone.turnOff();//Phone의 메소드. 상속받은 부모 클래스의 메소드를 사용할 수 있음 
	}

}
