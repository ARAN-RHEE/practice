package step11_API.Math;

public class MathExample {
	public static void main(String[] args) {
		int v1 = Math.abs(-5);  // abs() 메소드. 절대값 
		double v2 = Math.abs(-3.14); 
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);

		double v3 = Math.ceil(5.3); // ceil() 메소드. 올림값 
		double v4 = Math.ceil(-5.3);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);

		double v5 = Math.floor(5.3); // floor()메소드. 내림값 
		double v6 = Math.floor(-5.3);
		System.out.println("v5=" + v5);
		System.out.println("v6=" + v6);

		int v7 = Math.max(5, 9);  // max() 메소드. 최대값. 비교하는 파라미터 중 큰 수 리턴 
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7=" + v7);
		System.out.println("v8=" + v8);

		int v9 = Math.min(5, 9); // min() 메소드. 최소값. 비교하는 파라미터 중 작은 수 리턴 
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9=" + v9);
		System.out.println("v10=" + v10);

		double v11 = Math.random();  // random() 메소드. 0~1 사이의 숫자 랜덤으로 리턴. 1은 리턴 안하고 최대값은 0.9999999~ 
		System.out.println("v11=" + v11);

		double v12 = Math.rint(5.3); // rint() 메소드. 가장 가까운 double 값 리턴. 반올림과 비슷하지만 타입이 double임 
		double v13 = Math.rint(5.7);
		System.out.println("v12=" + v12);
		System.out.println("v13=" + v13);

		long v14 = Math.round(5.3);  // round() 메소드. 반올림 
		long v15 = Math.round(5.7);
		System.out.println("v14=" + v14);
		System.out.println("v15=" + v15);

		double value = 12.3456;
		double temp1 = value * 100;  // 1234.56
 		long temp2 = Math.round(temp1);  //반올림해줘서 1235
		double v16 = temp2 / 100.0; // 1235/100.0
		System.out.println("v16=" + v16); // 12.35
	}
}
