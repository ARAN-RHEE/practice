package step09.OutterThis;

public class Outter { 
	String field = "Outter-field";  // 필드 
	
	void method() {
		System.out.println("Outter-method");  // Outter 클래스의 메소드 
	}
	
	class Nested {  // 중첩 클래스 
		String field = "Nested-field";  // 중첩 클래스의 필드 
		void method() {  // 중첩 클래스의 메소드 
			System.out.println("Nested-method");
		}
		
		void print() { // 중첩 클래스의 메소드 
			System.out.println(this.field);  // 중첩클래스 안에서 this 사용하는 경우 중첩클래스 객체 자신의 참조 
			this.method();
			System.out.println(Outter.this.field); // 바깥 클래스명을 this.필드 앞에 사용하면 바깥클래스의 필드값 참조 
			Outter.this.method();
		}
	}
}
