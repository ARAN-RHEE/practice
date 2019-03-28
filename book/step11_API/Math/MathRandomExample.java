package step11_API.Math;

public class MathRandomExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		// Math.random() 함수는 0에서 1미만 수를 리턴하므로 *6을 해주면 0에서 5.xxxx 수 중  하나를 랜덤으로 리턴하게 된다.
		// int로 형변환  해서 0에서 5 사이 수를 랜덤하게 리턴하고, 1을 더해주면 1~6 사이의 랜덤한 수 하나를 리턴한다. -> 주사위 던지기
		System.out.println("주사위 눈 : " + num);

	}

}
