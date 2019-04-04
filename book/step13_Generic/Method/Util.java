package step13_Generic.Method;


public class Util {
	// 메소드 정의 
	// 접근제한자 + <타입파라미터> 리턴타입 메소드명(매개변수) 
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	// 메소드 정의 
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()); // 키 값 비교. 참조하는 위치가 같은지를 비교함 
		boolean valueCompare = p1.getValue().equals(p2.getValue()); // 밸류 값 비교. 담긴 내용이 같은지를 비교함 
		return keyCompare && valueCompare; // and 조건. 둘다 참이어야 true리턴 
	}
}
