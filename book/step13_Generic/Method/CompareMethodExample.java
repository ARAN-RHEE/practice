package step13_Generic.Method;

public class CompareMethodExample {

	public static void main(String[] args) {
		
		//Pair타입 객체 생성
		Pair<Integer,String> p1 = new Pair<Integer,String>(1,"사과");
		Pair<Integer,String> p2 = new Pair<Integer,String>(1,"사과");
		
		// compare() 메소드 호출. 구체적 타입을 명시적으로 지정했음 
		boolean result1 = Util.<Integer,String> compare(p1,p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		//Pair타입 객체 생성
		Pair<String,String> p3 = new Pair<String,String>("user1","홍길동");
		Pair<String,String> p4 = new Pair<String,String>("user2","홍길동");
		// compare()메소드 호출. 타입 명시하지 않고 추정 
		boolean result2 = Util.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

	}

}
