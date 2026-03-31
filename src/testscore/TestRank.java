package testscore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
	//Fields
	private int num;
	private int score;
	private int rank;
	
	// Constructor
	public Student(int num, int score) {
		this.num = num;
		this.score = score;
	}
	
	// Getter Setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	// toString
	@Override
	public String toString() {
		return "Student [num=" + num + ", score=" + score + ", rank=" + rank + "]";
	}
	
}

public class TestRank {

	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<>();
		sList.add( new Student( 1, 100 ) );
		sList.add( new Student( 3, 76 ) );
		sList.add( new Student( 5, 63 ) );
		sList.add( new Student( 4, 88 ) );
		sList.add( new Student( 9, 95 ) );
		sList.add( new Student( 2, 0 ) );
		sList.add( new Student( 11, 45 ) );
		sList.add( new Student( 8, 88 ) );
		sList.add( new Student( 6, 100 ) );
		
		dispList( sList );
		
		Collections.sort(sList, (a, b) -> {return a.getNum() - b.getNum();});
		dispList(sList);

		// 석차 구하기
		// 1. 점수를 기준으로 내림차순 정렬
		Collections.sort(sList, (a, b) -> {return b.getScore() - a.getScore();} );
		
		// 2. 석차 부여 - sorting 없이 석차를 구해라
		sList.get(0).setRank(1); // 첫 줄은 무조건 1등 고정 - 이게 없으면 i 가 0일때 .get(i-1)에서 오류가 난다.
		int rnk = 0;
		for (int i = 1; i < sList.size(); i++) {
			if(sList.get(i).getScore() == sList.get(i-1).getScore())
				rnk = sList.get(i-1).getRank();
			else
				rnk = i + 1;
			sList.get(i).setRank(rnk);
			
		}
		dispList(sList);
		
	}

	private static void dispList(List<Student> sList) {
		
		System.out.println("===========================================");
		for (Student student : sList) {
			System.out.println( student );
		}
		System.out.println("===========================================");
		
	}

}














































