package step08.exercise;

public class ActionExample {  // Action의 익명 구현 객체를 만들어 "복사를 합니다." 의 실행 결과 나오게 하기. 

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
	}

}
