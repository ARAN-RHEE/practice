package step06;

public class Calculator4Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스명 + . + 메소드명(파라미터)
		double result1 = 10*10*Calculator4.pi;  
		int result2 = Calculator4.plus(10, 5);
		int result3 = Calculator4.minus(10, 5);
		
		// 위에서 객체 생성을 하지 않아도 static 선언을 했기 때문에 바로 사용 가능. 
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
