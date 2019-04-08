package step12_Thread.SubClass2;

import java.util.Scanner;

public class MarathonExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("출전할 선수가 몇명입니까?");
		int player = scanner.nextInt();
		
		//스레드 PlayerA를 인원수 만큼 실행하기 
		for(int i=1; i<=player;i++) {
			PlayerA pa = new PlayerA(Integer.toString(i));
			pa.start();
		}
		
		
	}
}
