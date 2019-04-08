package step13_Generic.Exercise;

public class Container<T> {
	
	private T t;
	// get 메소드 선언 
	public T get() {
		return t;
	}
	
	//set 메소드 선언
	
	public void set(T t) {
		this.t = t;
	}
}
