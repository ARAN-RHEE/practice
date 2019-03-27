package step04_loop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	// 지정한 범위 내의 합, 지정한 배수의 합 구하기
	public static void main(String[] args) {
		
		try {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;  // 범위 내 합계를 담아줄 변수를 0으로 초기화 
		System.out.println("최소값 : ");
		int min = scanner.nextInt();  // 최소값 범위 지정 
	//	if(Calculator.class.isInstance(min)) { min에 담긴 값이 숫자인지 확인하는 메소드를 쓰려고했는데 어차피 nextInt라서 쓸모없음.. 
	//	} else {
	//		System.out.println("숫자를 입력하세요");
	//	}
		System.out.println("최대값 : ");
		int max = scanner.nextInt();  // 최대값 범위 지정 
		for(int i=min; i<=max;i++) {  // 최소값부터 최대값까지의 숫자 합계를 더해줌 
			sum += i;
		}
		System.out.println(min+"~"+max+" 사이 숫자의 합 : " +sum );
		
		System.out.println("범위 내에서 어떤 수의 배수를 더하고 싶습니까?");
		int result=0;  //조건을 충족하는 수의 합을 담아줄 변수 지정 
		int num = scanner.nextInt();  // 배수 num 지정 
		for(int i=min; i<=max; i++) {  // 범위 내에서 for문을 돌리고 
			if(i%num==0) { // 조건을 만족해야함. num으로 나누었을때 나머지가 0인 수. 즉 num의 배수를 
				result += i;  // result변수에 더해줌 
			}
		}
		System.out.println(min + "~" + max + "사이 " + num + "의 배수의 합 : " + result);

		}catch(InputMismatchException e) { // 숫자 말고 다른걸 입력했을때 예외처리
		System.out.println("숫자만 입력하세요");
		}
	}
}
