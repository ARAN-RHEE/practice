package step15_CollectionFramework.Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		// key, value값이 모두 String타입을 참조하는 HashTable 객체 생성 
		Map<String, String> map = new Hashtable<String, String>();

		//key값으로 id, value값으로 비밀번호를 입력받아서 저장 
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디 : ");
			String id = scanner.nextLine(); // 키보드로 입력한 아이디를 읽음 

			System.out.println("비밀번호 : ");
			String password = scanner.nextLine(); // 키보드로 입력한 비밀번호를 읽음 
			System.out.println();

			if (map.containsKey(id)) { // id가 존재하는지 먼저확인 후 존재한다면 
				if (map.get(id).contentEquals(password)) { //입력한 키에 맞는 비밀번호를 비교함 
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}

			} else { // id가 존재하지 않는다면 아래 실행문 출력 
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
