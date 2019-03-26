package step10;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = null; //data 변수는 null 값을 가지고 있기 떄문에 String 객체를 참조하고 있지 않음. 
		System.out.println(data.toString());  //data변수의 String객체 호출  - 참조 없어서 NullPointerException
	}

}
