package step04_loop;

public class Cal1 {

	public static void main(String[] args) {
		// 1000 이하의 3 또는 5의 배수의 총 합을 구하세요
		int sum = 0;
		int sum2 = 0;
		
		for(int i=1; i<1000; i++) {
			if(i%3==0||i%5==0) {
				sum+= i;
			}
			if(i%15==0) {
				sum2+=i;
			}
			
		}
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum-sum2);
	}

}
