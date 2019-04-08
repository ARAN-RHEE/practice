package step13_Generic.Exercise.P04;

public class ChildPair<K,V> extends Pair<K,V> {
	// Pair클래스가 파라미터를 갖는 생성자를 선언했으므로 
	//상속받는 ChildPair 역시 파라미터가 있는 생성자를 선언해주어야 함 
	public ChildPair(K k, V v) {
		super(k,v);
	}
}
