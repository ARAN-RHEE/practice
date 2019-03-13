package step02;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; //double의 경우 범위가 float보다 넓고, num2를 double로 형변환 가능 
		num2 = (int) num3; // 근사치가 아닌 그 값 그대로 변환되었기 때문에 
		
		int result = num1 - num2; //num1과 num2의 값이 같다. 
		System.out.println(result);
	}

}
