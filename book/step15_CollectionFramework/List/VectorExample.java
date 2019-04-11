package step15_CollectionFramework.List;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>(); // Vector 객체 생성 
		
		// add 순서대로 0번 인덱스부터 들어감 
		list.add(new Board("제목1","내용1","글쓴이1")); //0번
		list.add(new Board("제목2","내용2","글쓴이2")); //1번
		list.add(new Board("제목3","내용3","글쓴이3")); //2번
		list.add(new Board("제목4","내용4","글쓴이4")); //3번
		list.add(new Board("제목5","내용5","글쓴이5")); //4번
		
		list.remove(2); //제목3~ 인덱스 삭제. 뒤에 인덱스들 앞으로 땡겨짐 
		list.remove(3); //제목5~ 인덱스 삭제 
		
		// Board 객체의 필드 출력 
		for(int i=0; i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	}
	
}
