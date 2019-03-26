package step03;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int x = 1000000;
		int y = 1000000;
		int z = x * y;     
		System.out.println(z);
		*/
		//int z 에 int 타입의 범위를 초과하는 값이 닮기므로 정확한 값이 들어가지 않게됨! 
		
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
