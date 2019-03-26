package step06;

public class Calculator3 {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width*width;
	}
	
	//직사각형의 넓이
	double areaRecatngle(double width, double height) {
		return width*height;
	}
	
	// 오버로딩은 메소드의 이름이 동일해야 한다. 파라미터에 맞는 메소드가 실행된다. 메소드를 호출할때 파라미터를 1개만 넣었다면 
	// 정사각형의 넓이를  구할 것이고, 파라미터를 2개 넣었다면 너비*높이로 직사각형의 넓이를 계산할 것이다. 
}
