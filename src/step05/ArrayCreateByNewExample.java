package step05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]); //new 연산자로 int 배열을 생성.
			//배열의 값에는 int[] 타입의 초기값인 0이 들어감. 
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);  //배열 인덱스마다 값을 넣어줌. 
		}
		
		double[] arr2 = new double[3]; //double[] 타입의 초기값 0.0 이 들어감. 
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);  //참조 타입인 String배열의 경우 초기값이 null.
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

	}

}
