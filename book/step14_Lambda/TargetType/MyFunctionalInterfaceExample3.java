package step14_Lambda.TargetType;

public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi; 
		
		fi= (x,y) ->{
			int result = x+y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> {
			return x+y;
		};
		System.out.println(fi.method(2,5));
		
		fi = (x,y)->x+y;  // 실행문 안에 return문만 있을 경우 { }와 return 생략 가능 
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> sum(x,y);  // 실행문 안에 return문만 있을 경우 { }와 return 생략 가능 
		// 람다식 안에서 메소드 호출도 가능 
		System.out.println(fi.method(2,5));
		
		
	}
		public static int sum(int x, int y) {
			return (x+y);
		}
		
}

