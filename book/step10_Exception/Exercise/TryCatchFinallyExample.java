package step10_Exception.Exercise;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		String[] strArray = {"10","2a"};
		int value = 0;
		for(int i=0; i<=2; i++) { // for문에서 i가 0부터 2까지이므로 try-catch문이 3번 실행 
			try { 
				value = Integer.parseInt(strArray[i]); 
			} catch(ArrayIndexOutOfBoundsException e) {  
				System.out.println("인덱스를 초과했음");
			} catch(NumberFormatException e) { //상위 예외가 실행되면 catch블록 실행 후 finally블록으로 바로 감 
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);  
			}
			//첫번째 for문이 돌 때 strArray[0]은 숫자로 변환가능하므로 10 출력, value값에 10 들어감 
			//두번째 for문이 돌 때 strArray[0]은 숫자로 변환 불가능하므로 두번째 catch블록 실행. 숫자로 변환 불가능하므로 value에는 기존 값 그대로 10 
			//세번째 for문이 돌 때  strArray[2]는 배열의 크기를 벗어났으므로 첫번째 catch블록이  실행. value에는 기존 값 그대로 10 
		}

	}

}
