package step05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println( strArray[0] == strArray[1]); //배열이 아닌 String객체와 마찬가지로 
		//문자열 리터럴이 같으면 같은 주소를 참조함. 
		System.out.println( strArray[0] == strArray[2] ); // 그러나 new 연산자로 생성한 String 객체의 경우
		// 값을 메모리에 담고 new연산자로 한번 더 생성하므로 주소값이 다름. 
		System.out.println( strArray[0].equals(strArray[2]) ); //equals로 문자열 비교시에는 같으므로 true

	}

}
