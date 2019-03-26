package step03;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		
		System.out.println(v2 == v3); //true. 비교연산자에서도 연산 수행 전에 타입 변환을 해서 일치시킴. 
		// double 이 int보다 벙위가 크므로 위 연산에서 v2는 double 타입인 1.0으로 변환한 뒤에 비교함. 
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); // false. 0.1f는 0.1의 근사값이지만 같지는 않음. 
		System.out.println((float)v4==v5); // 해결 방법은 형변환으로 같은 타입으로 만들어주거나 
		System.out.println((int)(v4*10) == (int)(v5*10)); // 정수로 변환하면 됨! 
		
	}

}

