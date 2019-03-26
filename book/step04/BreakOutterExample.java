package step04;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter : for(char upper='A'; upper<='Z';upper++) {  //Outter 라벨 달아줌. 
			// 바깥쪽 for문은 초기화식 upper 변수에 A를 담고, Z까지 증가하는 조건을 가진다. 
			for(char lower ='a'; lower<='z'; lower++) {  // 안쪽 for문은 초기화식 lower 변수에 소문자 a를 담고, z까지 증가하는 조건
				System.out.println(upper + "-" + lower); 
				if(lower=='g') {  // 소문자를 담은 변수가 g일때
					break Outter; //Outter 이름을 가진 반복문을 종료시킨다. 
					// 보통 break는 가장 가까운 반복문을 종료시키는데, 라벨(이름)을 달아주면 해당 반복문을 종료시킨다.
				}
			}
		}
	
		System.out.println("프로그램 실행 종료");

	}

}
