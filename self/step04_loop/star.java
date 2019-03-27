package step04_loop;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇단 삼각형을 출력할까요?");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println("몇단 트리를 출력할까요?");
		int tree = scanner.nextInt();
		for(int i=1; i<=tree; i++) {
			for(int j=1; j<=tree-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}

}
