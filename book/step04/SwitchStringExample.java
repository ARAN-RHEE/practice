package step04;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "과장";
		// 자바 버전6 이하에서는 정수타입만 변수로 들어간 경우에 switch문을 사용할 수 있었지만
		// 자바 버전 7부터는 string 참조변수도 switch문의 변수로 사용할 수 있다.
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
	}

}
