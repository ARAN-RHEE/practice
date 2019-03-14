package step04;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;  // 변수 sum을 0으로 초기화. 
		
		for(int i=1; i<=100; i++) { // 초기화식 int i = 1; i는 1부터 시작해서 
			// 100까지, i++  1씩 증가. 
			sum += i;   // sum + i = sum 우측 피연산자를 좌측 변수와 연산하고 그 값을 좌측 변수에 대입. 
			// sum은 0으로 초기화가 되어 있고, i는 1씩 증가하므로 1+2+3+... + 100 
		}
		
		System.out.println("1~100의 합 : " + sum);
	}

}
