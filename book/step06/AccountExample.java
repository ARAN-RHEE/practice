package step06;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100); // 파라미터 값이 음수이므로 balance 값 유지 
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);  // 파라미터 값이 100만 초과이므로 balance 값 유지 
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());

	}

}
