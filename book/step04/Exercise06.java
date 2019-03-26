package step04;

public class Exercise06 {

	public static void main(String[] args) {
		/*
		 * * ** *** **** ***** 출력하기
		 */

		for (int i = 1; i <= 5; i++) {   
			for (int j = 1; j <= i; j++) {  //별을 하나씩 증가하게 찍으려면  조건식에서 j가 i보다 작거나 같아야한다.
				System.out.print("*");  
				if (j == i) {  // j가 i와 같을 때 줄바꿈 출력. 따라서 i번째 줄 별의 최대 갯수가 j개가 된다. 
					System.out.println();
				}

			}

		}
		System.out.println("----------");
		for(int a=0; a<5;a++) {
			for(int b=0; b<=a; b++) {
				System.out.print("*");
				if(b==a) {
					System.out.println();
				}
			}
		}

	}
}