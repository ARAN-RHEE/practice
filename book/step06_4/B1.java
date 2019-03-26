package step06_4; // A1과 같은 패키지 

public class B1 {
	
	//필드
	A1 a1 = new A1(true);  // public, default 는 같은 패키지 내에서 생성자에 접근할 수 있지만 
	A1 a2 = new A1(1);
	//A1 a3 = new A1("문자열");  // private은 생성자에 접근할 수 없으므로 에러가 뜸 
	
}
