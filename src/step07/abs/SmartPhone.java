package step07.abs;

public class SmartPhone extends Phone { //추상클래스 Phone을 상속받는 실체 클래스 SmartPhone
	//생성자 
	public SmartPhone(String owner) {
		super(owner); // 부모클래스의 생성자 호출 
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
