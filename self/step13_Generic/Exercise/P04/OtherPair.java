package step13_Generic.Exercise.P04;

public class OtherPair<K,V> {
	// 제네릭 타입 
	private K key;
	private V value;
	
	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
