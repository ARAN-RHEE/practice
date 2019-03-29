package step11_API.Format;

import java.text.DecimalFormat;

public class DemicalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89; // 변수 num에 double타입 1234567.89를 담아줌 
		double num1 = 1234567.12;
		double num2 = 1234567.49;
		DecimalFormat df = new DecimalFormat("0"); // 소수점 버리고, 반올림. 
		System.out.println(df.format(num));
		System.out.println(df.format(num1)); //반올림 확인용 
		System.out.println(df.format(num2));

		df = new DecimalFormat("0.0"); // 소수점 한자리 출력 
		System.out.println(df.format(num));

		df = new DecimalFormat("0000000000.00000"); // 소수점 아래 5자리까지출력하고 빈자리는 0으로 채움. 따라서 앞에도 0으로 나옴 
		System.out.println(df.format(num));

		df = new DecimalFormat("#"); // 0이랑 비슷하지만 빈자리는 채우지 않음 
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));

		df = new DecimalFormat("##########.#####"); // 소수점 아래 5자리까지 출력. 빈자리는 채우지 않음 
		System.out.println(df.format(num));

		df = new DecimalFormat("#.0"); //소수점 한자리까지 출력 
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0");  // 양수 소수점 1자리까지 출력 
		System.out.println(df.format(num));

		df = new DecimalFormat("-#.0"); // 음수 소수점 한자리까지 출력 
		System.out.println(df.format(num));

		df = new DecimalFormat("#,###.0");  // 단위 구분 사이사이 , 넣어주기 
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0E0");  // 지수 표현 
		System.out.println(df.format(num));

		df = new DecimalFormat("+#,### ; -#,###");  // 양수 음수 패턴 모두 기술할때 씀 
		System.out.println(df.format(num));

		df = new DecimalFormat("#.# %");  // 수를 %로 표현하기. 
		System.out.println(df.format(num));

		df = new DecimalFormat("\u00A4 #,###");  // 원단위 통화 기호 
		System.out.println(df.format(num));

	}

}
