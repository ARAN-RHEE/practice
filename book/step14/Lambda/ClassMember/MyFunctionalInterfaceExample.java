package step14.Lambda.ClassMember;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi; 
		
		
		fi=()-> {
			String str = "method Call1";
			System.out.println(str);
		};
		
		fi.method(); // 위 실행문 실행 
		
		
		fi= ()->{
			System.out.println("method call2");
		};
		
		fi.method(); // 두번째 실행문 실행. 인터페이스 변수에 새로 참조시킴 
		
		fi = ()->{
			System.out.println("method call3");
		};
		fi.method(); // 세번째 실행문 실행 
		
		
	}
}
