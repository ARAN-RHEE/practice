package step10_Exception;  // 사용자 정의 예외 연습

public class Account {

	private long balance;
	public Account() { }
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficiendException { // 사용자 정의 예외 떠넘기기 
		if(balance<money) {
			throw new BalanceInsufficiendException("잔고부족 : " + (money-balance)+ "모자람");  // 사용자 정의 예외 발생 
		}
		
		balance -= money;
	}

}
