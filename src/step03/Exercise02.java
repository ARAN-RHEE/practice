package step03;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int x1 = ++x;
		int y1 = y--;
		//증감연산자가 피연산자 앞에 있으면 다른 연산 수행 전에 피연산자 값 1 증가
		//증감연산자가 피연산자 뒤에 있으면 다른 연산 수행 후에 피연산자 값 1 감소 
		int z = (++x) + (y--);
		System.out.println(z); //z 결과값에 y의 증감연산자는 뒤에 있으므로 영향을 주지 않음. 연산 후에 y만 변화 
		
		
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(y);
	}

}
