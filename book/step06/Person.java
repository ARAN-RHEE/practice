package step06;

public class Person {
	//final 필드 
	final String nation = "Korea";
	final String ssn;  // 선언만 하고 값 없음 
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
