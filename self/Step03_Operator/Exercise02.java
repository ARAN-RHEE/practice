package Step03_Operator;
// 전위연산자 + 후위연산자 

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x : ");
		int x = scanner.nextInt();
		System.out.println("y : ");
		int y = scanner.nextInt();
		
		int z = (++x) + (y--);
		// 전위 연산자는 주어진 연산 전에 값을 미리 더하거나 빼주기때문에 x는 위에서 선언한 것보다 1이 증가한 상태 
		// 후위 연산자는 연산이 종료 된 뒤에 값을 더하거나 빼기때문에 연산이끝나기전에는 기존값이 그대로 들어감. 연산이 끝난 뒤 y-- -> 1빼줌 
		System.out.println("x : "+ x);
		System.out.println("z : " + z);

	}

}
