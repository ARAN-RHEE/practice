package step06_Class;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; // 인덱스 100개인 배열을 생성하고,
	// 계좌번호, 계좌주, 초기잔액을 배열로 담아줌
	private static Scanner scanner = new Scanner(System.in);
	// 사용자의 입력을 기다리고 저장하는 스캐너 메소드를 사용하기 위해 스캐너 객체 생성
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
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
		String ano = scanner.next(); // 값을 입력하기 위해 선언
		System.out.println("계좌주 : ");
		String owner = scanner.next(); // Q2. 왜 계좌번호와 계좌주 입력이 동시에 실행될까요..? nextLine -> next로 해결
		System.out.println("초기입금액");
		int balance = scanner.nextInt();

		// 입력할 값을 Account타입 객체에 담으려고 생성 
		Account ac = new Account(ano, owner, balance);
		ac.setAno(ano);
		ac.setOwner(owner);
		ac.setBalance(balance);

		 // 배열에 담아줄때, 배열에 담긴 값이 없다면 그 값에 넣어주기. 추가로 넣어줄 때 이미 값이담겨있다면 다음 인덱스에 값 넣기 
			for (int i = 0; i < accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = ac;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;  // 한 인덱스에 한 정보만 넣어야하므로 break 
				}
			}
		}
	
	//계좌 조회화기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌 목록");
		System.out.println("--------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {  // 배열에서 값이 담겨있는 인덱스는 모두 출력 
				System.out.println(accountArray[i].getAno() + "," + accountArray[i].getOwner() + ","
						+ accountArray[i].getBalance()); // 필드에 직접 접근할 수 없으므로 getter 메소드 사용해서 정보 가져오기 
			}
		}
	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next(); // 계좌번호 입력
		System.out.println("예금액 : ");
		int deposit = scanner.nextInt(); // 입금액 입력. 위에서 입력한 계좌번호에 해당하는 배열 값을 찾고 예금액 입력 후 잔액에 더해주어야 함.
		Account findAccount = findAccount(ano); // 해당 계좌번호의 잔액이 담겨있는 배열 값 리턴
		int total = deposit + findAccount.getBalance(); // 입금할 금액과 기존 잔액 더해주기
		findAccount.setBalance(total);  // 값 넣어주기 
		System.out.println("예금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next(); // 계좌번호 입력
		System.out.println("출금액 : ");
		int withdraw = scanner.nextInt(); // 위에서 입력한 계좌번호에 해당하는 배열 값을 찾고 출금액 입력 후 잔엑에서 빼주어야 함
		// deposit() 과 거의 비슷한 방식
		Account findAccount = findAccount(ano); // 해당 계좌번호의 잔액이 담겨있는 배열 값 리턴
		int total = findAccount.getBalance() - withdraw; // 기존 금액에서 출금할 금액 빼주기. 
		findAccount.setBalance(total); // 잔액 배열에 넣어주기 
		System.out.println("출금이 성공되었습니다.");
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;  //일단 null로 초기화 한 객체 생성. 동일한 계좌번호를 찾고 담아줄 예정. 
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]!=null) { // 배열에 값이담겨있다면 
				if (ano.equals(accountArray[i].getAno())) {  //입력한 계좌번호와 기존 데이터에 담긴 계좌번호가 일치한지 확인 
				account = accountArray[i]; // 일치한다면 그 배열의 값을 account 변수에 참조시킴 
				break;// 하나만 찾으면 되니까 break 
				}
			}
			
		}
		return account;  

	}
}
