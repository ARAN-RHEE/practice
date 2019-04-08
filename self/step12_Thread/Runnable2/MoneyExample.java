package step12_Thread.Runnable2;

import java.util.Scanner;

public class MoneyExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계모임에 참가하는 인원이 몇명입니까?");
		int participants = sc.nextInt();
		System.out.println("월 입금액이 얼마입니까?(단위 : 만원)");
		int monthlyPayment = sc.nextInt();
		System.out.println("목표 모금액이 얼마입니까? (단위 : 만원)");
		int goal = sc.nextInt();

		int termOfPayment = (int) (Math.ceil((double) goal / (double) (participants * monthlyPayment)));
		int personalGoal = goal / participants;

		for (int i = 1; i <= participants; i++) {
			Thread thread = new Thread(new Gye_mo_im(participants, monthlyPayment, goal, termOfPayment, i));
			thread.start();
	//	thread.sleep(1000);	
		}
		
	//	System.out.println("한 사람 당 입금액은" + personalGoal + "이고 목표금액 달성시까지 약 " + termOfPayment  +"개월 걸립니다.");
		return;
	}
}