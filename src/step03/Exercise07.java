package step03;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		
		System.out.println((x>7)&&(y<=5)); // &&연산자. 두 조건이 모두 true 여야 결과값 true 산출. 
		// x는 7보다 크고, y는 5보다 작거나 같으므로 결과 값 : true
		System.out.println((x%3==2)|| (y%2!=1)); //||연산자. 두 조건 중 하나만 true여도 결과값은 true.
		// 10을 3으로 나눈 나머지는 1, y를 2로 나눈 나머지는 1이므로 두 조건 식 모두 false여서 결과값 역시 false.
	}

}
