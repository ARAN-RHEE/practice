package step06;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3}; // sum1 메소드의 경우 파라미터를 배열 타입으로 지정 
		int result1 = myCom.sum1(values1); // 따라서 메소드 호출 전에 배열을 선언하거나 
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5}); 
		System.out.println("result 2 : " + result2); // 메소드 호출과 동시에 배열을 선언하면 됨 
		
		int result3 = myCom.sum2(1,2,3);  //sum2 메소드의 경우 배열타입이긴 하지만 ... 를 사용했기 때문에 
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);  // 파라미터 리스트만 넘겨줘도 됨 
		System.out.println("reslut4 : "  + result4);
				

	}

}
