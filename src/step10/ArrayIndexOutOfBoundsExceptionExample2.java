package step10;

public class ArrayIndexOutOfBoundsExceptionExample2 {

	public static void main(String[] args) {  // ArrayIndexOutofBoundsExample 오류 안나게 고쳐보기 
		// TODO Auto-generated method stub
		if(args.length == 2) {  //배열의 길이를 배열값 읽기 전에 먼저 파악하기 
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2 );
		} else {  // 배열의 인덱스 갯수가 위 조건이 아닐때 
			System.out.println("실행 방법");
			System.out.println("java ArrayIndexOutofBoundsExceptionExample ");
			System.out.println("값1 값2");
		}
	}	

}
