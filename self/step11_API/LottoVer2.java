package step11_API;

public class LottoVer2 {

	public static void main(String[] args) {
	//	LottoVer2 lt = new LottoVer2();
	//	lt.makeLottoNumber(); // 메소드 호출
		makeLottoNumber();

	}

	private static int[] asc(int[] lotto) {//배열 안에 담긴 값을 오름차순으로 정렬하는 메소드 
		for (int i = 0; i < lotto.length; i++) { 
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		return lotto;
	}

	private static void makeLottoNumber() {
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 0 ~45 사이 랜덤한 숫자 하나를 배열에 담아줌
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) { // 배열 중복 제거. 같은 값이 나오면 다음으로 넘어가지 않고 다시 숫자 담아주기
					i--;
					// break;
				}
			}
		}
		asc(lotto);
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i] +" ");
		}
	} 
}
