package step11_API.Exercise;

public class Member {
	// Member 클래스를 작성하되, Object의 toString() 를 오버라이딩해서 MemberExample 클래스의
	// 실행 결과처럼 나오도록 작성하기  
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	// invokes myObject.toString()
	// println() 을 사용할때는 타입에 따라 toString()메소드를 오버라이딩 해주면 됨. 
	public String toString() {
	 return id + " : " + name;
	}
}
