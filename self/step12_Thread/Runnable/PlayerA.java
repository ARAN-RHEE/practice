package step12_Thread.Runnable;

import java.util.Calendar;
import java.util.Scanner;

public class PlayerA extends Thread {
	String name;
	PlayerA(String name) {
		this.name = name;
	}
    
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "의 평균 속도는?");
		int avgSpeed = sc.nextInt();
		int time = (int)(Run.DISTANCE / avgSpeed)+1;
		// 빨리 작업 끝내려고 일단 속도를 초속으로 계산
		Calendar cal = Calendar.getInstance();

		long startTime =  cal.getTimeInMillis();
		long currentTime =startTime;

		while(true){
    	  System.out.println(name+"번 선수가 달립니다.");
           currentTime = cal.getTimeInMillis();
          
           if(currentTime>startTime+time*1000) {
        	   break;
           }
       }
       System.out.println(name+"번 선수가 종점에 도착했습니다.");
   
	}	

}
