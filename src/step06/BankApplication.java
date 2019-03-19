package step06;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택 > ");
		
		int selectNo = scanner.nextInt();
		
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	// 계좌 생성하기 
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌 생성");
		System.out.println("--------");
		System.out.println("계좌 번호 : ");
		System.out.println("계좌주");
		System.out.println("초기입금액");
	}
	
	private static void accountList() {
		
	}

	private static void deposit() {
		
	}
	
	private static void withdraw() {
		
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기 
	private static Account2 findAccount(String ano) {
		
	}
		
}
