package step04;

public class ContinueExample {

	public static void main(String[] args) {
		// 반복문에서 continue를 만나면 continue 이후의 구문을 실행하지 않고 다음 반복문으로 이동한다. 
		for(int i=1; i<=10; i++) {  // int i는 1부터, 10까지 , 1씩 증가 
			if(i%2!=0) {  //i를 2로 나눈 나머지가 0이 아닐때. 즉 i가 홀수일 때
				continue; //i가 홀수일 때 continue
			}
			
			System.out.println(i);  //i가 홀수일 때 continue를 만났으므로 i를 출력하는 실행문을 실행하지 않는다.
			// 즉 짝수만 실행되게 된다. 
		}
	}

}
