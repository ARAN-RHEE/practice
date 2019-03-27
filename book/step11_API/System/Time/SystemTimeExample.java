package step11_API.System.Time;

public class SystemTimeExample {
//프로그램 실행 속도 구하기 
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		//프로그램을 시작하기 전에 시간을 변수에 담아주고 
		
		int sum = 0;
		for(int i=0; i<=1000000; i++) {  // 1부터 백만까지의 합을 구하기 
			sum += i;
		}
		
		long time2 = System.nanoTime();  //프로그램이 종료됬을때의 시간을 변수에 담아주기 
		
		System.out.println(sum);
		System.out.println((time2-time1)+"나노초 소요");  // 프로그램 실행 소요 시간 
	}

}
