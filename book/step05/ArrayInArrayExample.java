package step05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다차원 배열.
		int[][] mathScores = new int[2][3]; //2x3의 배열 선언. 
		for(int i=0; i<mathScores.length; i++) { //mathScores.length = 배열 A의 길
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		//그림 첨부. 
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();		
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}
	
	}

}
