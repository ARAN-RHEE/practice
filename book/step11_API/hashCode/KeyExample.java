package step11_API.hashCode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		// HashMap의 식별키로 Key 객체를 사용하면 저장된 값을 찾아오지 못함. 
		// number 필드 값이 같더라도 hashCode() 메소드에서 리턴하는 해시코드가 다르기 때문 
		// 따라서 null 값 출력 
		// "홍길동"을 읽으려면 number를 리턴할 수 있는 hashCode()메소드를 오버라이딩 해주어야함.
	}

}
