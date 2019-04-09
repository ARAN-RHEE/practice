package step04_loop;

import java.util.Scanner;

public class FibonacciNumbers {
	public static void main(String[] args) {
		//피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것
		Scanner sc = new Scanner(System.in);
		System.out.println("수열의 갯수를 지정하세요 : ");
		int maxNum = sc.nextInt();
		int num1=0;
		int num2=1;
		int num3;
		
		for(int i=0; i<maxNum;i++) {
			num3=num1+num2;
			System.out.print(num3+",");
			num1=num2;
			num2=num3;
		}
	}
}
