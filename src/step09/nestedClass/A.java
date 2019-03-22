package step09.nestedClass;
//바깥 클래스
public class A {
	A(){  // 생성자 
		System.out.println("A 객체가 생성됨.");//생성자에서 출력됨 
	}
	
	// 인스턴스 멤버 클래스 
	class B {  // 중첩클래스 B 
		B(){
			System.out.println("B 객체가 생성됨."); // 생성자에서 출력됨 
		}
		int field1;
		//static int field2; // 인스턴스 멤버 클래스는 static 필드를 선언할 수 없음 
		void method() {
		}
		//static void method2(){  // 인스턴스 멤버 클래스는 static메소드를 선언할 수 없음 
		}
	

	// 정적 멤버 클래스
	static class C{
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;  // 정적 멤버 클래스는 인스턴스필드/메소드/정적필드/정적메소드 모두 선언 가능 
		void method1() {
		}
		static void method2() {
		}
	}	
		
	void method() {
		//로컬 클래스 - 메소드 안에서 사용 
		class D{
			D(){
				System.out.println("D 객체가 생성됨.");
			}
			
			int field1;
			//static int field2; // 로컬 클래스는 정적 필드/정적 메소드 선언 안됨 
			void method1() {
			}
			// static void method2(){ } 
		}
		
		D d = new D(); 
		d.field1 = 3;
		d.method1();
	}
}
