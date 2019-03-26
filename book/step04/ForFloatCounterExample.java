package step04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(float x = 0.1f; x<=1.0f; x+=0.1f) {  //초기화 식에서 float/double 부동소숫점 타입을 사용하지 않아야 되는 이유.
			System.out.println(x);
			//0.1은 float타입으로 정확하게 표현할 수 없기 때문. 
		}
	}

}
