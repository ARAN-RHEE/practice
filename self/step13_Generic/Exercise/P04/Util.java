package step13_Generic.Exercise.P04;

public class Util {
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		// 메소드의 첫번째 파라미터는 Pair 객체 또는 그 하위 객체 , 두번째 파라미터는 키 값
		// Pair객체의 키값이 두번째 파라미터와 같다면 pair객체에 저장된 값 리턴 
		if (p.getKey() == k) {
			return p.getValue();
		} else {
			// 같지않다면 null 리턴 
			return null;
		}
	}

}
