package step06;

public class Member {
	
	//연습문제 13. 회원 이름/아이디/비밀번호/나이 데이터를 가지는 Member 클래스 선언 
	String name = "이름";
	String id ="아이디";
	String password = "비밀번호";
	int age;
	
	// 이 클래스에 생성자를 추가하고 싶을 때 Member 객체 생성 시 name필드와 id필드를 외부에서 받은 값으로 초기화하려면 
	// name 과 id를 파라미터로 갖는 생성자를 추가한다. 
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}
