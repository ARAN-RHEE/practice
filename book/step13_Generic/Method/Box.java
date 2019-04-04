package step13_Generic.Method;

public class Box<T> {
	// 제네릭 사용해서 클래스 수정하기 
	// 타입 파라미터 T를 사용해서 Object 타입을 모두 T로 대체했음 
	// T는 Box클래스로 객체를 생성할 때 구체적인 타입으로 변경됨 
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	
	// Type 패키지의 Box2에서 메소드 선언시 <T>를 붙이지 않은 이유는 
	// 클래스 선언 시에 <T> 타입파라미터가 선언되어 있기 때문. 
}
