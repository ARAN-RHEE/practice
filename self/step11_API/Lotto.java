package step11_API;

public class Lotto {
	// 로또 번호 6개 생성하기. 오름차순 정렬.
	// Math.random() 클래스 사용

	public static void main(String[] args) {
		// 로또 번호를 담을 배열 생성 
		int[] lottoArray = new int[6];
		for (int i = 0; i < 6; i++) {
			lottoArray[i] = (int) (Math.random() * 45) + 1;  //0 ~45 사이 랜덤한 숫자 하나를 배열에 담아줌 
			for (int j = 0; j < i; j++) {
				if (lottoArray[i] == lottoArray[j]) {  // 배열 중복 제거. 같은 값이 나오면 다음으로 넘어가지 않고 다시 숫자 담아주기 
					i--;
					// break;
				}
			}
		}
		for (int i = 0; i < lottoArray.length; i++) { // 배열에 담긴 값을 오름차순으로 정렬하기. 큰 수가 나오면 자리 바꿔줌 
			for (int j = i+1; j < lottoArray.length; j++) {
				if (lottoArray[i] > lottoArray[j]) {
					int temp = lottoArray[i];
					lottoArray[i] = lottoArray[j];
					lottoArray[j] = temp;
				}
			}
		}

		for (int i = 0; i < lottoArray.length; i++) { // 출력할때 사이사이 , 넣어주기 
			if (i == lottoArray.length - 1) {
				System.out.println(lottoArray[i]);
			} else {
				System.out.print(lottoArray[i] + ",");
			}

		}
	}

}
