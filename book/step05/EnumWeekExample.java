package step05;

import java.util.Calendar; // Calander 객체를 사용하기 위해 import 

public class EnumWeekExample {

	public static void main(String[] args) {
			Week today = null;  //열거 타입 변수 선언 
			
			Calendar cal = Calendar.getInstance();
			int week = cal.get(Calendar.DAY_OF_WEEK); //일(1)~토(7)까지의 숫자 리턴 
			
			switch(week) {//switch문. 해당 case의 실행문을 실행함. 
				case 1:    
					today = Week.SUNDAY; break;  //today에 열거 상수 대입 
				case 2:
					today = Week.MONDAY; break;
				case 3:
					today = Week.TUESDAY; break;
				case 4:
					today = Week.WEDNESDAY; break;
				case 5:
					today = Week.THURSDAY; break;
				case 6:
					today = Week.FRIDAY; break;				
				case 7:
					today = Week.SATURDAY; break;		
			}
			
			System.out.println("오늘 요일: "+ today);
			
			if(today == Week.SUNDAY) {
				System.out.println("일요일에는 축구를 합니다.");
			} else {
				System.out.println("열심히 자바 공부합니다.");
			}
	}

}
