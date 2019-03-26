package step05;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] oldIntArray = { 1, 2, 3 };  // oldIntArray 배열 변수에 1,2,3 값 저장 
		int[] newIntArray = new int[5];  //크기가 5인 배열 새로 생성. 
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];  //oldIntArray 변수에 담긴 값을 새 배열에 값 대입해줌. 복사의 개념.
			//다만 oldIntArray 배열의 크기는 3이었으므로, 이를 초과하는 4번째 값과 5번째 값은 초기값 0이 들어가게 됨.
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}
