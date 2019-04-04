package step13_Generic.WildCard;

public class Person { // 가장 상위 객체 
	
	//필드로 String타입 선언 
	private String name;
	
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public String toString() {
		return name; 
	}
}
