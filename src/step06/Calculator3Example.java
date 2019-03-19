package step06;

public class Calculator3Example {

	public static void main(String[] args) {
		// cal3 메소드를 사용하기 위해 객체 생성. 외부에서 메소드를 호출하기 때문. 
		Calculator3 myCalcu = new Calculator3();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRecatngle(10, 20);
		
		//결과 출력
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
		
	}

}
