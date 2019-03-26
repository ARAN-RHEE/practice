package step09.memberClass.Access;

public class A {
	int field1;
	void method1() {  }
	
	static int field2;
	static void method2() { }
	
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();  //인스턴스 멤버 클래스는 모든 필드와 메소드에 접근 가능 
		}
	}
	
	static class C {
		void method() {   //정적 클래스는 인스턴스 필드와 메소드에는 접근할 수 없음
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2(); 		}  
	}
}
