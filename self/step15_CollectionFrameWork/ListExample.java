package step15_CollectionFrameWork;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		// getBoardList()메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴하게 메소드를 작성하기 
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}
}
