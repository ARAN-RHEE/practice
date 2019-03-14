package step04;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;  //합계를 저장할 변수
		int i = 1; //카운터 변수. i는 1로 초기화 되어 있음. 
		
		while(i<=100) {   //i가 100이하일 때까지 while문 실행. 즉 100을 초과할 때 while문이  종료됨.
			sum += i;  //sum = sum+i. 0으로 초기화 된 sum에 1씩 증가하는 i를 더하고, 그 값을 sum에 저장. 
			i++; // 1씩 증가. 
		}
		System.out.println(i);  //while문을 종료한 뒤의 i 
		System.out.println("1~" + (i-1) + "합 : "  + sum);
	}

}
