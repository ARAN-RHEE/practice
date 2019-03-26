package step02;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;		
		long var2 = 20L;		
		//long var3 = 1000000000000;    //컴파일 에러
		//int 타입의 범위를 넘어서는 경우 정수 리터럴에 'L'을 붙여야 함.
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
