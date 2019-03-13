package step03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  // try-catch. 예외(Exception)가 발생했을 때 catch 구문의 결과값 출력. 
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음.");
		}  //right 파라미터가 0보다 크지만, left파라미터보다 int최대값-right파라미터의 값이 크므로 예외처리로 넘어감. 
	}
	
	public static int safeAdd(int left, int right)  {  //safeAdd 메소드 선언.
		//right 파라미터가 0보다 클때, 
			//int 의 최대값에서 right 파라미터를 뺀 값이 left파라미터보다 작다면 예외처리.
		if((right>0)) { 
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생.");
			}
		} else {
			// 혹은 int 의 최대값에서 right 파라미터를 뺀 값이 left파라미터보다 크다면 예외처리.
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생.");
			}
		}
		return left + right;
		// 두 파라미터를 더한 값을 return해준다.

	}

}
