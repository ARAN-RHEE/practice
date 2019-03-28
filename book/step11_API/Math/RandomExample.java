package step11_API.Math;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//로또 번호 얻기 
		//선택번호 
		int[] selectNumber = new int[6]; //로또는 6개의 숫자이므로 크기가 6인 배열 생성
		Random random = new Random(3); //종자값으로 3을 줌. Random객체의 메소드를 사용하기 위해 객체 생성
		System.out.print("선택 번호 : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1; // 선택 번호를 얻어 배열에 저장 
			// nextInt(파라미터-int타입) -> 0<=리턴값<45 
			System.out.print(selectNumber[i]+ " ");
		}
		
		System.out.println();

	

		//당첨번호
		int[] winningNumber = new int[6]; 
		random = new Random(5); //위에 선택번호와는 다른 종자값을 줌. 종자값이 같다면 선택번호와 당첨 번호가 같게됨 
		System.out.print("당첨 번호 : ");
		for(int i=0; i<6; i++) {
			winningNumber[i]= random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		// 당첨 여부 
		Arrays.sort(selectNumber); // 두 배열을 비교하기 전에 정렬 
		Arrays.sort(winningNumber); // 두 배열을 비교하기 전에 정렬 
		boolean result = Arrays.equals(selectNumber, winningNumber); // 배열 항목 값 비교 
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.print("1등에 당첨되셨습니다.");
		} else {
			System.out.print("당첨되지 않았습니다.");
		}
	
	}
}