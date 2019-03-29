package step11_API.equals;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue"); // Member 객체 생성, 파라미터 blue를 갖는 생성자 호출 
		Member obj2 = new Member("blue");// Member 객체 생성, 파라미터 blue를 갖는 생성자 호출 
		Member obj3 = new Member("red");// Member 객체 생성, 파라미터 red를 갖는 생성자 호출 
		
		if(obj1.equals(obj2)) { //매개값이 Member타입이고 id필드값이 동일하므로 true 
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) { // 매개값이 Member타입이지만 id필드값이 다르므로 false
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}
}