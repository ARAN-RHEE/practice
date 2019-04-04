package step13_Generic.Extend;

// 제네릭 인터페이스 선언 
public interface Storage<T> {
	// 추상메소드 선언. 인터페이스를 구현하는 클래스에서 실행부를 작성해야함 
	public void add(T item, int index);
	public T get(int index);
}
