package step12_Thread.Runnable;

import java.util.Scanner;

public class Asc implements Runnable {

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("최대값을 입력하세요(오름차순)");
		int maxNum = scanner.nextInt();
		for(int i=1;i<=maxNum;i++) {
			System.out.println(i+"(Asc)"); // 어떤 스레드가 실행되는지 보려고 클래스명 같이 출력 
		}
		
	}

}
