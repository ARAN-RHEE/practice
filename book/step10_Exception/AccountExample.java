package step10_Exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		//출금하기
		try {
		account.withdraw(30000);  // 입금액보다 출금액이 크기때문에 withdraw메소드의 예외 발생 
		} catch(BalanceInsufficiendException e) {  // 예외 메세지 얻기 
			String message = e.getMessage();
			System.out.println(message); // 예외 추적 후 출력 
			System.out.println();
			e.printStackTrace();
		}
	}
}
