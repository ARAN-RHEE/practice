package step15_CollectionFramework.Set;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 오버라이딩 하는 이유 
	// 인스턴스가 달라도 이름과 나이가 같다면 동일한 객체로 간주해 중복 저장을 방지하려고 
	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof Member) { // obj가 Member타입인지 확인한 뒤에 
			Member member = (Member) obj; // 타입 변환을 해주고 
			return member.name.equals(name) && (member.age == age); // name과 age가 같으면 true 리턴 
		} else {
			return false;
		}
	}
	
	
	@Override
	public int hashCode() { // name과 age가 같으면 동일한 hashCode 리턴 
		return name.hashCode() + age;
	}
}
