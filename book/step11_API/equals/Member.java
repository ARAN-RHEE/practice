package step11_API.equals;

//equals 메소드 재정의 

public class Member {
	public String id; // Member클래스에 필드 정의 
	public Member(String id) { //파라미터가 필요한 생성자 정의 
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) { // 메소드 오버라이딩 
		if(obj instanceof Member) { // obj 변수가 참조하는 객체가 Member 타입인지 확인 
	 		Member member = (Member) obj; // Member타입으로 강제 타입 변환하고 id 필드값이 동일한지 검사한 후, 동일하다면 true 리턴
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		return false;  // 매개값이 Member타입이 아니거나 id필드값이 다르면 false 리턴 
	}
}
