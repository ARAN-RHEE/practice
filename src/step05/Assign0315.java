package step05;

import java.util.Scanner;

public class Assign0315 {

	public static void main(String[] args) {
		// 자연수 1~100 수 중 5개를 임의로 입력 후  순서대로 출력하기 
		//값을 입력할 수 있게, 하드코딩을 사용하지 않고 구현하기  
		int arraySize = 5; //입력할 숫자 갯수
		int minNum = 1; //범위의 최소값 
		int maxNum = 100;  // 범위의 최대값 
		int[] array = new int[arraySize];  
		boolean run = true; // 조건을 만족하는 배열 값을 모두 입력했을 때 또 다른 while문이 실행되게 하기 위한 변수.
		Scanner scanner = new Scanner(System.in);  //Scanner 객체는 입력받을 때까지 기다린다. 
		
		while(true) { // 입력값이 int가 아닐때 예외처리도 해놓기. 예외부분 공부할때 
			 for(int i=0; i<array.length;i++) {
				System.out.println("array[" + i + "] : ");
				array[i]=Integer.parseInt(scanner.nextLine());
				run = true; // run이 true라고 해놓은 이유는 아래 if문의 조건을 충족했을 때 run = false 가 되기 때문에 이를 바꿔주기 위함.
				if(array[i] > maxNum || array[i] < minNum ) { // 입력한 숫자가 범위를 초과할 경우 
					System.out.println("MSG 1 : " + minNum +"이상 " + " " + maxNum + "이하의 수를 입력하시오"); // 경고
					run = false; // 아래 while문이 실행되지 않게 false 
					i--;  // 1. 처음으로 돌아가지 않고 범위를 초과한 그 순번부터 다시 입력하게 하려면 i가 증가하지 않게 i-- 
					//break; // 2. 범위를 초과한 수를 입력하고 "for문의 처음"으로 돌아가게 하려면 break 
				}
			}
			while(run) {
				for(int i=0; i<array.length;i++) {
					for(int j = i+1; j<array.length;j++) {
					// 큰 수가 나왔을 때, 두 변수의 자리를 바꿔주기 
					if(array[i]>array[j]) {
						//임시적으로 큰 수를 담아줄 변수 temp 선언
						int temp = array[i];
						// 비교할 때 앞에 있는 수가 크다면, temp에 담아주고 
						// 뒤에 있는 작은 변수를 array[i]에 담는다.
						// 이때는 array[i]와 array[j]가 비교할때의 작은수로 둘 다 들어가게 됨.
						array[i] = array[j];
						//temp에 담아뒀던 큰 수를 array[j]에 다시 대입해주면!!
						array[j] = temp;
						//배열의 값이 서로 바뀌게 된다!
						}
					}
				System.out.println(array[i]);
				}
				break;
			}
		}
		
	/*	
		
		for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+",");
		}
		
	/*	
		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
					if(array[i]<array[j])
					min = array[i];
				} 
				System.out.println(min);	
			} 
		*/
		/*
		for(int i=0; i<array.length ; i++) {
			for(int j = i+1 ; j < array.length; j++) {
				if(array[i]<array[j]) {
					min = array[i];			
				}
				minArray[i] = min;	
			}
			System.out.print(minArray[i] +" ");
		}
		*/
		
	/*	for(int i=0; i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					min = array[i];
						for(int k=0; k<5;k++) {
						minArray[k] = min;
							}	
				}
			} 
			System.out.println(minArray[i]);
		}
		
		
		
		
		
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>=max) {
				max = array[i];
			}
		}
						
		System.out.println();
		System.out.println("max : " + max);   */

	}

}
