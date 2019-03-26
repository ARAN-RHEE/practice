package step09.nestedClass;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();  // 정적 클래스는 new C로 할 필요 없이 바로 객체 생성 가능 
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;  // 정적 필드와 메소드는 변수 이용 없이 바로 객체 생성가능 
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method(); // 로컬 클래스는 메소드 호출 시 객체 생성됨. 
				
	}

}
