package step12_Thread.Runnable;

import java.util.Scanner;

public class Desc implements Runnable {

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("최대값을 입력하세요(내림차순)");
		int maxNum = scanner.nextInt();
		for(int i=maxNum;i>=1;i--) {
			System.out.println(i+"(Desc)");
		}
		
	}

}
