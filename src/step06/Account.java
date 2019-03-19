package step06;

public class Account {

	//필드
	private int balance; // 외부에서 balance 필드 수정 못하게 private로 선언 
	final static int MIN_BALANCE = 0;  // balance의 최소 범위값 
	final static int MAX_BALANCE = 1000000; // balance의 최대 범위값 
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {  // setBalance 파라미터 값이 범위 내에 있다면 
		this.balance = balance;  // 현재 밸런스 값 유지 
		} // 범위를 초과하는 경우는 이전 balance가 유지되게 함. 위 if문 조건을 충족할 때만 설정하고 범위 초과 시 따로 설정하지 않음 
	}
	
}
