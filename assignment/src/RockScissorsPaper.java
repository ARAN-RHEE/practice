package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RockScissorsPaper {
	int scissors = 1;
	int rock = 2;
	int paper = 3;

	public void rock(int computer) {
		if (computer == 1) {
			System.out.println("컴퓨터 : 가위");
			System.out.println("당신이 이겼습니다!");
		} else if (computer == 2) {
			System.out.println("컴퓨터 : 바위");
			System.out.println("비겼습니다!");
		} else {
			System.out.println("컴퓨터 : 보");
			System.out.println("당신이 졌습니다!");
		}
	}

	public void scissors(int computer) {
		if (computer == 1) {
			System.out.println("컴퓨터 : 가위");
			System.out.println("비겼습니다!");
		} else if (computer == 2) {
			System.out.println("컴퓨터 : 바위");
			System.out.println("당신이 졌습니다");
		} else {
			System.out.println("컴퓨터 : 보");
			System.out.println("당신이 이겼습니다!");
		}
	}

	public void paper(int computer) {
		if (computer == 1) {
			System.out.println("컴퓨터 : 가위");
			System.out.println("당신이 졌습니다!");
		} else if (computer == 2) {
			System.out.println("컴퓨터 : 바위");
			System.out.println("당신이 이겼습니다!");
		} else {
			System.out.println("컴퓨터 : 보");
			System.out.println("비겼습니다!");
		}
	}

	public static void main(String[] args) {
		RockScissorsPaper rsp = new RockScissorsPaper();

		System.out.println("----가위바위보 게임!------");
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				int computer = (int) (Math.random() * 3) + 1;
				System.out.println("1. 가위 | 2. 바위 | 3. 보");
				int user = scanner.nextInt();
				if (user == 1) {
					rsp.scissors(computer);
				} else if (user == 2) {
					rsp.rock(computer);
				} else {
					rsp.scissors(computer);
				}
				
				System.out.println("한판 더 하시겠습니까?");
				System.out.println("1. 네 | 2. 아니오");
				int moreGame = scanner.nextInt();
				if (moreGame == 2) {
					System.out.println("--------게임 종료--------");	
					return;
				}

			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요!");
		}
	}
}
