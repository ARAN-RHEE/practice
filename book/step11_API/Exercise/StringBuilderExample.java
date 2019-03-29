package step11_API.Exercise;

// 1~100까지의 숫자를 통 문자열로 만드려고 for문 작성 
// String객체가 100개 생겨서 비효율적이므로 StringBuilder를 사용해서 효율적으로 만들기 
public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.println(str);

		//StringBuilder 객체 생성하고 
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i); //append 문자열 더해주기메소드. 
		}
		// 책에서는 sb.toString() 사용해서 String으로 변환해줌 
		System.out.println(sb);
	}
}