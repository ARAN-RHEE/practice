package step04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		//while문
		int i=1;
		while(i<=10) {  //조건식(i<=10) 이 true일 때 실행문(여기서는 i출력하는 부분)이 계속 반복된다. 
			// 실행문이 모두 실행되면 다시 조건식으로 되돌아가서 조건식을 다시 평가한다.
			// 조건식이 false 이면 while문도 종료된다.
			System.out.println(i); 
			i++;//i가 1씩 증가. 즉 1부터 시작해서 점점 1씩 증가하고, 10을 초과할 때 while문이 종료된다.
		}

	}

}
