package step05;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		//배열의 항목에서 최대값 구하기.
		
		for(int i=0; i<array.length;i++) { //i의 최대범위를 array.length 전까지 한 이유는 
			// 이 문제에서는 배열의 길이를 알 수 있지만 배열의 길이를 모를때는 배열의 크기 전(인덱스는 갯수-1이므로) 까지 범위를 지정해 주면 되기 때문이다.
			if(array[i]>max) {
				max = array[i]; //배열의 값이 max보다 크다면 max에 배열의 항목 대입해줌. 최종적으로 가장 큰 수만 남게 된다.
			}
		}
		
		System.out.println(max);
	}

}
