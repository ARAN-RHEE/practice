package step05;

public class test3 {
	public static void main(String[] args) {
		
		String abc = "abc"; //���ڿ� ���ͷ��� String ��ü ����
		String abc1 = "abc"; // ���ڿ� ���ͷ��� String ��ü ����
		String abc2 = new String("abc"); // new �����ڷ� String ��ü ����
		
		if(abc==abc1) { //���ڿ� ���ͷ��� ��ü�� ������ ���, ���ڿ� ���ͷ��� �����ϴٸ� String ��ü�� �����ϵ��� �Ǿ�����.
						// abc�� abc1�� ���� �ּҸ� ������ �ִ�.
			System.out.println("1. true");
		} else {
			System.out.println("1. false");
		}
		
		
		if(abc == abc2) { // new �����ڸ� ����ؼ� String ��ü�� �������� ��� ��ü�� ������ ������ ���̱� ������ �ּҰ��� �ٸ�.
			System.out.println("2. true");
		} else {
			System.out.println("2. false");
		}
		
		//������ String ��ü�̰� �ٸ� String ��ü�̰� ������� ���ڿ��� ���� ������ String��ü�� equals() �޼ҵ带 ����ϸ� ��.
		System.out.println("3. " + abc2.equals(abc));
		System.out.println("3. " + abc2.equals(abc1));
	}
}
