package step12_Thread.Control.Join;

public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() { // 1~100 합 구하기 
		for(int i=1; i<=100; i++) {
			sum+= i;
		}
	}
}
