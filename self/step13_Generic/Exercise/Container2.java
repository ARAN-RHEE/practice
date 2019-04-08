package step13_Generic.Exercise;

public class Container2 <T,I>{
	// 타입 파라미터가 2개 
	private T t;
	private I i;
	
	// 필드 t값 가져오는 get 메소드선언 
	public T getKey() {
		return t;
	}
	
	public I getValue() {
		return i;
	}
	
	//필드 t, i에 값을 넣어주는 set메소드 선언 
	public void set(T t, I i) {
		this.t = t;
		this.i = i;
	}

}
