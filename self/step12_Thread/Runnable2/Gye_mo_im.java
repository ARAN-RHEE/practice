package step12_Thread.Runnable2;

import java.util.Scanner;

public class Gye_mo_im implements Runnable {
	private int ParticipantNumber;
	private int monthlyPayment;
	private int goal;
	private int termOfPayment;
	private int i;

	public Gye_mo_im(int participants, int monthlyPayment, int goal, int termOfPayment, int i) {
		this.ParticipantNumber = participants;
		this.monthlyPayment = monthlyPayment;
		this.goal = goal;
		this.termOfPayment = termOfPayment;
		this.i = i;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int j = 1; j <= termOfPayment; j++) {
			sum += monthlyPayment;
			System.out.println(j + "달차 계모임 멤버" + i + "이 " + monthlyPayment + "를 입금했습니다.");

		}
	}

}
