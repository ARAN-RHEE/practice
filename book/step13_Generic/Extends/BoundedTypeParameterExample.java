package step13_Generic.Extends;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//String str = Util.compare("a","b"); // String은 Number타입이 아니어서 사용 불가능 
		
		// compare() 메소드 : 첫번째 파라미터가 두번째 파라미터보다 크다면 1 리턴, 작다면 -1 리턴
		int result1 = Util.compare(10, 20); // int -> Integer로 자동 박싱. Number타입으로 제한을 걸었으므로.
		System.out.println(result1);
		 
		
		int result2 = Util.compare(4.5, 3); // double -> Double로 자동 박싱. 
		System.out.println(result2);

	}

}
