package step13_Generic.Method;

public class Pair<K,V> {
	// 타입 파라미터 2개 사용 
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key=key;
		this.value=value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
