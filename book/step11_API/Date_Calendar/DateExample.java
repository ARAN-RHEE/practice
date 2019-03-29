package step11_API.Date_Calendar;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date(); // Date클래스 객체 생성. 기본생성자 사용 시 현재 날짜를 읽어 Date 객체로 만듬  
		String strNow1 = now.toString();  //  문자열로 얻으려면 toString 메소드 사용 
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//원하는 특정 문자열 포맷으로 얻으려면 SimpleDateFormat 객체 사용 
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}
