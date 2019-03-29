package step11_API.Format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date now = new Date();
		//Date 객체 생성 
		
		// SimpleDateFormat의 파라미터에 원하는 형식을 문자열로 주고 format()메소드로 호출하면 출력 가능 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));

		//다른 형식은 소문자이지만 월은 대문자로 해야함 MM 
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		// 0~12시 표현은 h, 0~23시 표현은 H 
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));

		// 월 구분이 없는 일은 D. 1~365일 중 하나 출력 
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));

	}

}
