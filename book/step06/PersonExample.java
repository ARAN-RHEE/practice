package step06;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	
		//p1.nation = "usa";
		//p1.ssn = "555555-1231231";  final필드는 값 수정 불가능함 
		p1.name = "을지문덕";				//final이 아니고 일반 필드로 선언되었으므로 값 변경 가능. 
		System.out.println(p1.name);
	
	
	
	}

}
