package step05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores; //int 배열 변수 선언. 
		scores = new int[] {83, 90, 87}; //이미 선언된 변수에 다른 실행문에서 중괄호를 사용해 배열을 생성하려면 new 연산자 사용.
		int sum1 = 0; 
		for(int i=0; i<3; i++) {
			sum1 += scores[i]; //sum1 + scores[i]의 합을 sum1 변수에 저장. 
		}
		
		System.out.println("총합 : " + sum1);
		
		//리턴된 총합을 sum2에 저장
		int sum2 = add(new int[] {83,90,87} ); //add메소드 호출. 
		System.out.println("총합 : " + sum2);
		System.out.println();

	}
	
	public static int add(int[] scores) { //배열에 값 목록을 넣어주는 메소드 생성. 
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		return sum;
	}

}
