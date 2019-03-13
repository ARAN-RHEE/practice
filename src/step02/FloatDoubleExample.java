package step02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double var1 = 3.14;		//실수값 저장
		//float var2 = 3.14;	//컴파일 에러 - type mismatch. Float의 경우 뒤에 F를 붙여줘야함. 
		float var3 = 3.14F;
		
		//정밀도 테스
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		//double이 float보다 더 정밀함. 더블 타입의 가수 bit수가 float타입의 가수 bit보다 약 두배 더 크기 때문 
		
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);

	}

}
