package OOP;

import java.util.Scanner;

public class RockScissorsPaper {
	int scissors=1;
	int rock = 2;
	int paper = 3;
	
	public void rock(int computer) {
		if(computer==1) {
			System.out.println("��ǻ�� : ����");
			System.out.println("����� �̰���ϴ�!");
		} else if(computer==2) {
			System.out.println("��ǻ�� : ����");
			System.out.println("�����ϴ�!");
		} else {
			System.out.println("��ǻ�� : ��");
			System.out.println("����� �����ϴ�!");
		}
	}
	
	public void scissors(int computer) {
		if(computer==1) {
			System.out.println("��ǻ�� : ����");
			System.out.println("�����ϴ�!");
		} else if(computer==2) {
			System.out.println("��ǻ�� : ����");
			System.out.println("����� �����ϴ�");
		} else {
			System.out.println("��ǻ�� : ��");
			System.out.println("����� �̰���ϴ�!");
		}
	}
	
	public void paper(int computer) {
		if(computer==1) {
			System.out.println("��ǻ�� : ����");
			System.out.println("����� �����ϴ�!");
		} else if(computer==2) {
			System.out.println("��ǻ�� : ����");
			System.out.println("����� �̰���ϴ�!");
		} else {
			System.out.println("��ǻ�� : ��");
			System.out.println("�����ϴ�!");
		}
	}
	
	public static void main(String[] args) {
		RockScissorsPaper rsp = new RockScissorsPaper();

		System.out.println("----���������� ����!------");
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. ���� | 2. ���� | 3. ��");
			int user = scanner.nextInt();
			int computer = (int)(Math.random()*3)+1;
			if(user==1) {
				rsp.scissors(computer);
			} else if (user==2) {
				rsp.rock(computer);
			} else {
				rsp.scissors(computer);
			}
			
			System.out.println("���� �� �Ͻðڽ��ϱ�?");
			System.out.println("1. �� | 2. �ƴϿ�");
			int moreGame = scanner.nextInt();
			if(moreGame==2) {
				System.out.println("--------���� ����--------");
				return;
			}
			
			
		}
	}
}
