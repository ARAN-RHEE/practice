package step03;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.0;
		double y = 0.0;
		
		double z = x%y;  // 5.0을 0.0으로 나눈 몫은 infinity, 나머지는 NaN이 산출됨.
		if(Double.isNaN(z)) { // 변수 z가 NaN인지 검사 
			System.out.println("0.0으로 나눌 수 없습니다");  //NaN 일 경우 = true , 결과값 실행
		} else {
			double result = z + 10;  //NaN이 아닐 경우, else 문 실행. 
			System.out.println("결과 : " + result);
		}
	}

}
