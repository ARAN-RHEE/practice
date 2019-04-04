package step13_Generic.Type;

public class Box2<T> {
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
}
