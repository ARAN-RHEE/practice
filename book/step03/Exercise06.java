package step03;

public class Exercise06 {
	public static void main(String[] args) {
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)((lengthTop + lengthBottom) * height * 0.5);
		// 사다리꼴의 넓이를 구하는 공식은 (윗변 + 아랫변)*높이 * 0.5
		// 주어진 변수 밑변, 아랫변, 높이가 int 이지만 정확한 계산을 위해서는 double로 형 변환이 필요함. 
		
		System.out.println(area);
	}

}
