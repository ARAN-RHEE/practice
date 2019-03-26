package step02;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; //num2의 값이 float로 완전히 표현될 수 없어서 근사치로 변환됨. 
		num2 = (int) num3; //근사치 변환에서 다시 int로 형변환. 
		
		int result = num1 - num2;
		System.out.println(result); //따라서 형변환을 통해 손실이 일어나 num1과 num2가 같지 않음.
	}

}
