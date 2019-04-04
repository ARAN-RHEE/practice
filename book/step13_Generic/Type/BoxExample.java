package step13_Generic.Type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		//Box 의 필드 타입이 Object라서 자바의 모든 객체를 담을 수 있지만, 
		// 저장하거나 읽어올 때 Object로 타입 변환을 해주어야 함 
		String name = (String) box.get(); // String 타입을 파라미터로 가져왔으므로 Object로 변환 
		
		box.set(new Apple()); //Apple 객체를 넣어줄 떄 Object로 타입 변환 
		Apple apple = (Apple)box.get();

	}

}
