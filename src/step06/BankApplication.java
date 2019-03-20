package step06;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];  // 인덱스 100개인 배열을 생성하고, 
	// 계좌번호, 계좌주, 초기잔액을 배열로 담아줌 
	private static Scanner scanner = new Scanner(System.in);  
	// 사용자의 입력을 기다리고 저장하는 스캐너 메소드를 사용하기 위해 스캐너 객체 생성 
	
	

	public static void main(String[] args) {
	//	String ano;
	//	String owner;
	//	int balance;
		
		
		//Account2 access = new Account2(Stirng ano, String owner, int balance);   
		// Q1. getter setter 메소드 접근하려고 선언.. 
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
		String ano = scanner.nextLine(); // 값을 입력하기 위해 선언 
		
		System.out.println("계좌주 : ");
		String owner = scanner.nextLine();  // Q2. 왜 계좌번호와 계좌주 입력이 동시에 실행될까요..? 
		
	//	if(ano!=null) {
	//		System.out.println("계좌주 : ");
	//	}
	//	String owner = scanner.nextLine();
		
		System.out.println("초기입금액");
		int balance = scanner.nextInt();
		
		Account2 ac = new Account2(ano, owner, balance);
		int arrayNum = 0; // Q3. 가장 처음에 입력할때는 당연히 인덱스가 0번이어야 하는게 맞지만, 
		// 계좌를 추가로 입력하면 그 다음 순번에 입력되어야 하는데.. arrayNum 초기값을 어디서 선언해야하는건지..? 
		accountArray[arrayNum] = ac; // 변수 ac에 담긴 Account2 객체(계좌번호, 계좌주, 잔액)를 배열에 넣어주고 
		arrayNum++; // 인덱스 번호를 증가시켜 순차적으로 배열에 넣어준다. 
		
		System.out.println("계좌가 생성되었습니다.");
	}
	
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌 목록");
		System.out.println("--------");
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i]); // 계좌 목록에 담긴 정보 -> 배열에 담았으니 그것을 출력해줌. 
			} else {
				System.out.println("등록된 계좌가 없습니다.");
				break; //break 안써주면 for문이 계속 반복되서 계좌 없다는 출력문이 배열 길이만큼 반복 
			}
		}
	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.println("계좌번호 : ");
		String ano = scanner.nextLine(); // 계좌번호 입력 
		System.out.println("예금액 : ");
		
		int deposit = scanner.nextInt(); // 위에서 입력한 계좌번호에 해당하는 배열 값을 찾고 예금액 입력 후 잔액에 더해주어야 함. 
		int arrayNumAno = findAccount(ano); // 해당 계좌번호의 잔액이 담겨있는 배열의 인덱스 리턴 
		int total = deposit + Integer.parseInt(accountArray[arrayNumAno]); // 입금할 금액과 기존 잔액 더해주기 
		// Q4. accountArray[arrayNumAno] 가 String이 아니라서 에러가 뜨는것 같은데.. Account2 -> String 변환이 가능한가요..? 
		accountArray[arrayNumAno].setBalance(total);
		
		System.out.println("예금이 성공되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.println("계좌번호 : ");
		String ano = scanner.nextLine(); // 계좌번호 입력 
		System.out.println("출금액 : ");
		int withdraw = scanner.nextInt(); // 위에서 입력한 계좌번호에 해당하는 배열 값을 찾고 출금액 입력 후 잔엑에서 빼주어야 함 
		// deposit() 과 거의 비슷한 방식 
		System.out.println("출금이 성공되었습니다.");
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기 
/*	private static Account2 findAccount(String ano) {
		for(int i=0; i<accountArray.length; i++) {
			if(ano.equals(Arrays.toString(accountArray[i]))) {
				return i+2;
			}
		}
	} */
	
	private static int findAccount(String ano) {
		int findArray = 0;  // 0으로 초기값 줌 
		for(int i=0; i<accountArray.length; i++) {
			if(ano.equals(accountArray[i])) { // Q5. Account2 자료형이 String과 관계없다고 나와서 toString으로 변환하려했으나
				// if(ano.equals(Arrays.toString(accountArray[i]))) 는 에러 뜸. 
				findArray = i+2; // 잔액은 계좌번호의 index number에서 2를 더한 값이므로 (계좌번호, 계좌주, 잔액) 	
			}
		}
		return findArray; 
		// Q6. Account 배열에서 ano와 동일한 Account 객체 찾는 메소드를 만들 때 리턴타입을 int로 하지 않고 account2를 사용하는 이유
	}
		
}
