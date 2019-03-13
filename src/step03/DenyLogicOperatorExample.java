package step03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean play = true;
	    System.out.println(play); //play변수에 true값이 담겨 있으로 콘솔창에 true 출력. 

	    play = !play;
	    System.out.println(play); //!의 경우 피연산자가 true 이면 false, false이면 true 산출.
	    //play = !play; 는 false. 

	    play = !play;//!의 경우 피연산자가 true 이면 false, false이면 true 산출.
	    //변수는 계속 값이 변하므로 위에서 false가 담겨있었고, 다시 논리 부정 연산자를 사용해서 true값 산출. 
	    System.out.println(play);
		}

}
