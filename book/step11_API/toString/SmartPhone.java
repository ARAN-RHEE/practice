package step11_API.toString;

public class SmartPhone {
	public String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	
	@Override
	public String toString() {  //toString 메소드를 재정의 
		return company + ", " + os;  // 필드 company값, os값 호출하는 메소드로 변경 
	}
}
