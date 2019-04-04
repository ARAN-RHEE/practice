package step12_Thread.Runnable;

public class MarathonExample {
	public static void main(String[] args) {
		PlayerA pa = new PlayerA("1");
		
		pa.start();
	}
}
