package step11_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FindDayOfTheWeek  {
	// 입력한 날짜의 요일 구하기 
	public static void main(String[] args) throws ParseException, Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 구할 날짜를 입력하세요. ex)20180101");
		String day = sc.next();
		findTheDayOfTheWeek(day); // 메소드 호출. 입력값을 메소드의 파라미터로  넘겨줌 
		
	}
	
	public static void findTheDayOfTheWeek(String day) throws ParseException {
		// static 선언해야 위에 메소드에서 객체 생성없이 바로 사용 가능 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		//SimpleDateForamt -> java 의 Date 클래스를 특정 포맷에 맞게 변환해주는 API
		Date date = dateFormat.parse(day);
		// parse 메소드 -> String을 Date로 파싱해줌 
		
		Calendar cal = Calendar.getInstance();
		// Calendar 클래스의 getInstance() : 현재 운영체제에 설정되어 있는 시간대를 기준으로 한 Calendar 객체를 얻을 수 있음 
		cal.setTime(date); // date를 Calendar로 맵핑시키기 
		
	
		if(cal.get(Calendar.DAY_OF_WEEK)==1) {
			System.out.println(day+ "는 일요일 입니다.");
		} else if(cal.get(Calendar.DAY_OF_WEEK)==2) {
			System.out.println(day+ "는 월요일 입니다.");
		}else if(cal.get(Calendar.DAY_OF_WEEK)==3) {
			System.out.println(day+ "는 화요일 입니다.");
		}else if(cal.get(Calendar.DAY_OF_WEEK)==4) {
			System.out.println(day+ "는 수요일 입니다.");
		}else if(cal.get(Calendar.DAY_OF_WEEK)==5) {
			System.out.println(day+ "는 목요일 입니다.");
		}else if(cal.get(Calendar.DAY_OF_WEEK)==6) {
			System.out.println(day+ "는 금요일 입니다.");
		}else {
			System.out.println(day+ "는 토요일 입니다.");
		}
		
		
	}
}
