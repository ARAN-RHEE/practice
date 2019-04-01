package step10_Exception.Cal;

public class Calculator3 extends Calculator2 {
	int a;
	int b;
	
	public long power(int a,int b) {
		// 	int result = a^b; 자바에서는 제곱으로 ^ 안씀.. 
		// 기본제공하는 Math.pow() 메소드가 제곱의 기능을 수행함 
			long result = 1;
			for(int i=1; i<=b;i++) {
				result *= (long)a; // 맨 처음은 1로 시작하고 a를 for문이 한번 돌때마다 곱해줌. 그러면 a를 b번 곱하게 됨!
			}
			System.out.println(result);
			return result;
	}
	

}
