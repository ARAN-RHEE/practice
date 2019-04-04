package step13_Generic.Method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		//Box<Integer> box1 = Util.boxing(100); 타입 파라미터를 Integer로 추정 
		Box<Integer> box1 = Util.<Integer>boxing(100); // 타입  파라미터를 명식적으로 Integer 지정 
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("홍길동"); 
		String strValue = box2.get();
	}
}
