package step12_Thread.Rank;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//스레드 10개 생성 
			Thread thread = new CalcThread("thread"+i);
			if(i!=10) { // 스레드10번이 아닌 경우 우선순위를 최저 -> 1로 주고 
				thread.setPriority(Thread.MIN_PRIORITY);
			} else { // 스레드가 10번일때는 우선순위 10을 줌. 
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			//스레드 실행 
			thread.start();
		}
		
		/* 스레드 10이 가장 먼저 끝남.
		하지만 다시 실행한다면 순서가 뒤죽박죽이 됨. 왜 그럴까? 
		스레드가 먼저 Start 되었더라도 스케줄링과 동시성, 병렬성 등에 의해 실행 순서가 달라짐
		하나의 코어에서 모두 동시성으로 실행된다면 스레드 10이 가장 빨리 끝나는게 맞지만
		멀티 코어에서 병렬성으로 실행된다면 스레드 10이 가장 빨리 끝나지 않을 수 있음
		멀티 코어에서는 스레드 우선 순위가 의미 없음   */
		
	}

}
