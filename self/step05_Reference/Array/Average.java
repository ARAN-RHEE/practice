package step05_Reference.Array;
import java.util.Scanner;

public class Average { //내가 입력한 값의 총합과 평균 구하기 
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력할 성적의 과목 개수는??");
		int arrIdx = scanner.nextInt(); // 입력할 데이터 갯수 정하기 
		int arr[] = new int[arrIdx];  // 배열의 크기로 지정 
		int sum = 0; 
		while(run) {
			for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]  :");  // 값 하나씩 입력하기 
			arr[i]=scanner.nextInt();
			sum += arr[i];  // 입력한 값을 모두 더해주기. 
			}
			run = false; //값을 배열 크기만큼 입력했으면 while문 종료
			double avg = (double) sum / (double)(arr.length);  // 평균을 소수점까지 구하려고 타입 변환 
			System.out.println("성적의 총 합계는 : "+sum);
			System.out.println("성적의 평균은 : " + avg);
		}
		
	}
	
}
