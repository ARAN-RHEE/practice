package step11_API.Wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100); // 매개값으로 기본 타입의 값을 넣어줌 
		Integer obj2 = new Integer("200"); // 매개값으로 문자열을 넣어줌 
		Integer obj3 = Integer.valueOf("300"); // 생성자를 이용하지 않고 valueOf()메소드를 사용해도 넣어줄 수 있음 
		
		//Unboxing
		int value1 = obj1.intValue();  // 언박싱하려면 기본타입명 + Value() 메소드 호출 
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
