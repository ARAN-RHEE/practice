package step04;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 중첩 for문 
		for(int m=2;m<=9;m++) {  // 바깥쪽 for문이 1번 실행될 때마다 
			System.out.println(m+"단");
			for(int n=1; n<=9;n++) {  // 안쪽 for문이 지정된 횟수만큼 돌고, 다 돌면 바깥쪽 for문으로 다시 돌아간다.
				System.out.println(m+"x"+n+"="+m*n);
			}
		} 
	}
	
	
	
}
