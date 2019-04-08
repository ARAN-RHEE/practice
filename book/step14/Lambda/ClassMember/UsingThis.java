package step14.Lambda.ClassMember;

public class UsingThis {
	public int outterField = 10; // 필드값 지정 
	
	class Inner {
		// 중첩 클래스 Inner 선언. UsingThis클래스 안에 중첩되어 있음 
		int innerField = 20; // 중첩클래스 Inner의 필드 
		
		void method() {
			// 람다식
			MyFunctionalInterface fi = ()->{
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : "  + UsingThis.this.outterField+"\n"); 
				// 바깥객체의 참조를 얻기 위해서는 클래스명.this 사용 
				
				System.out.println("innerField : "  + innerField );
				System.out.println("innerField : " + this.innerField+"\n");
				// 람다식 내부에서 this는 Inner객체를 참조 
			};
			
			fi.method();
		}
	}
}
