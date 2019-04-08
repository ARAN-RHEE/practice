package step14.Lambda.TargetType;

public class MyFunctionalInterfaceExample2 {
	public static void main(String[] args) {
		MyFunctionalInterface2 fi; 
		
		fi= (x)-> { // 파라미터가 있으므로 () 괄호 안에 넣어줌 
			int result = x*5;
			System.out.println(result);
		}; 
		fi.method(2);  // 메소드 호출시 파라미터 필요하므로 넣어주기. 
		
		fi = (x)->{
			System.out.println(x*5);
		};
		fi.method(2);
		
		fi = x -> System.out.println(x*5); // 매개변수가 1개일 경우에는 () 괄호 생략 가능 
		fi.method(2);
	}
}
