package step14_Lambda.Reference;

public class Calculator {
	// 두 메소드는 동일한 기능이지만 static으로 선언하느냐 아니냐 차이가 있음 
	public static int staticMethod(int x, int y) {
		return x + y;
	}
	
	public int instanceMethod(int x, int y) {
		return x + y;
	}
}
