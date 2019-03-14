package step04;

public class Exercise03 {

	public static void main(String[] args) {
		
		// 1부터 100까지의 정수 중 3의 배수의 총합을 구하는 코드 
		int sum = 0;  // 총 합을 구해야 하므로 총합을 저장할 변수를 선언하고 0으로 초기화한다. 
		
		for(int i=1; i<=100; i++) {  // 1부터 100까지의 정수라는 조건을 for문에 적어준다.
			if(i%3==0) { // 3의 배수의 총합. 즉 i를 3으로 나누었을 때 나머지가 0이어야 한다. 
				sum+=i; // if문을 만족할 때, 즉 3의 배수일 때 sum 변수에 i를 더해준다. 
			}
			
		}
		
		System.out.println(sum);
	}

}
