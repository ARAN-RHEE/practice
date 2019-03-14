package step04;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		//Math.random() 함수는 0에서 1 사이의 double타입의 수를 하나 리턴한다. 
		// 따라서 1부터 6까지의 랜덤한 수를 뽑기 위해서는 int로 형변환 한 Math.random()*6+1 값을 가지면 된다.
		
		
		/*if문의 경우 조건을 만족하지 않으면 else if를 사용해 또 다른 조건식을 작성하는 방법이라 결과가 true, false 밖에 없어서 경우의 수가 
		 많으면 else-if를 추가적으로 반복해야 하지만 
		switch문의 경우 변수의 값에 따라서 실행문이 결정되므로 if문보다는 코드가 간단하다. 변수가 case 뒤에 값일 경우 그 실행문을 따라간다. */
		switch(num) {
		case 1 : 
			System.out.println("1번이 나왔습니다.");
			break; // break가 붙은 이유는 다음 case를 실행하지 않고 swtich문을 종료하기 위해서이다. 
			//break가 없으면 case값과 상관 없이다음 case가 실행됨. 
		case 2 : 
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 : 
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 : 
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 : 
			System.out.println("5번이 나왔습니다.");
			break;
		case 6 : 
			System.out.println("6번이 나왔습니다.");
			break;
		}

	}

}
