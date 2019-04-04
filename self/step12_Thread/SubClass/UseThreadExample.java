package step12_Thread.SubClass;

public class UseThreadExample {
	public static void main(String[] args) {
		// 스레드 객체 생성 
		Paper paper = new Paper();
		Rock rock = new Rock();
		Scissors scissors = new Scissors();
		
		// 스레드 실행. 실행할때마다 콘솔에 출력되는 결과가 달라짐 
		paper.start();
		rock.start();
		scissors.start();
	}
}
