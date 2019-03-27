package step11_API.System.getProperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");  // 개별 속성 읽기 
		String userName = System.getProperty("user.name");  // 개별 속성 읽기 
		String userHome = System.getProperty("user.home"); // 개별 속성 읽기

		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);

		System.out.println("---------------------------------");
		System.out.println(" [ key ]  value");
		System.out.println("---------------------------------");
	
		Properties props = System.getProperties();
		Set keys = props.keySet();
		// 모든 속성의 키와 값 출력하기 
		for (Object objKey : keys) { 
			// 향상된 for문 (변수타입 변수명 : 배열이름 ) { 실행부분 ; } 
			// 배열의 항목 수만큼 실행문 반복 
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ]  " + value);
		}

	}

}
