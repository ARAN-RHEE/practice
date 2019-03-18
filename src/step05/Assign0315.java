package step05;

public class Assign0315 {

	public static void main(String[] args) {
		// 자연수 1~100 수 중 5개를 임의로 입력 후  순서대로 출력하기 
		int[] array = {10,2,1,8,5};
		
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
		}
		
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
