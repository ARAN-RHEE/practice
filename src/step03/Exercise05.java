package step03;

public class Exercise05 {

	public static void main(String[] args) {
		// 변수 value 값의 10의 자리 이하를 버리는 코드 
		int value = 356;
		System.out.println(value-value%100);
		abc();
		//10의 자리 이하8
	}
	
	public static void abc() {
		String s1 = "a";
		System.out.println(s1);
		def(s1);
		System.out.println(s1);
	}
	
	public static void def(String s2) {
		System.out.println(s2);
		s2 = "b";
	}

}
