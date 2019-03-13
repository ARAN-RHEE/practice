package step02;

public class VariableScopeExample {

	public static void main(String[] args) {

		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10; // 'v1이 10 이상일 때, v1 변수값 - 10 = v2 변수값' 의미
		}
		
	//	int v3 = v1 + v2 + 5;
		// v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김.
		// v2는 if문 안에서 선언된 지역변수. v1은 메인 메소드 안에서 선언되었으므로 내부 어디서든 사용 가능한 전역변수.
		
	}

}
