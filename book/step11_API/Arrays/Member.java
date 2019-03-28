package step11_API.Arrays;

public class Member implements Comparable<Member>{ // Member타입만 비교하기 위해 제네릭 사용 
	String name; //필드 선언 
	Member(String name) { // 생성자 선언 
		this.name = name;
	} 
	@Override  // compareTo()는 비교값을 리턴하도록 오버라이딩
	// compareTo()의 리턴값은 오름차순일 때 자신이 매개값보다 작으면 음수, 같으면 0, 크면 양수 리턴 
	// Member 타입일 때 오름차순으로 정렬하기 위한 메소드 
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
