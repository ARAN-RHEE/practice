package step09.Anonymous;

public class AnonymousExample2 {

	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();
		
		//익명 객체 필드 사용
		anony.field.turnOn();
		
		//익명 객체 로컬 변수 사용
		anony.method1();
		Anonymous2 an = new Anonymous2();
		//an.method1(). 메소드 안에 익명 객체로 로직이 생성되어있어 메소드를 벗어나면 접근 불가 
		
		//익명 객체 매개값 사용
		anony.method2(
			new RemoteControl() { //익명 객체를 메소드2의 파라미터로 줌 
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다");
				}
				
				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
				}
			}
		);
		// anoony.method2().turnOff(); 접근불가 
		//	anony.field.turnOff();
		// 불필요한 클래스 생성을 막음. 편의성 
	}

}
