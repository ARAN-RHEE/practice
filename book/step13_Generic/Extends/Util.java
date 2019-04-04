package step13_Generic.Extends;

public class Util {
	// 제네릭<T> 타입의 메소드 compare() 선언. 타입 파라미터는 Number 타입 또는 그 하위 타입이어야 함 
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // Number 클래스에 있는 메소드 
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
