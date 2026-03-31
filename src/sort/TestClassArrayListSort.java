package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Member {
	private int mno;

	public Member(int mno) {
		this.mno = mno;
	}

	public int getMno() {
		return mno;
	}

	@Override
	public String toString() {
		return "Member [mno=" + mno + "]";
	}
	
}

public class TestClassArrayListSort {

	public static void main(String[] args) {
		
		/*
		// ArrayList 는 생성자를 통해 초기값을 설정 : java 8 이하는 이 방법을 사용함
		ArrayList<Member> mList = new ArrayList<>(
			Arrays.asList(
					new Member(13), new Member(15), new Member(15), 
					new Member(5), new Member(1), new Member(7) 
			)
		);
		 */
		// ArrayList 는 생성자를 통해 초기값을 설정 : java 9 이상은 이 방법을 사용함
		List<Member> mList = new ArrayList<>(
			List.of(
					new Member(13), new Member(15), new Member(15), 
					new Member(5), new Member(1), new Member(7) 
			)
		);
		// System.out.println(mList);
		dispList( mList );
		
		// 오름차순 정렬
		Comparator<Member> compAsc = new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {
				return o1.getMno() -o2.getMno();
			}
		};
		
		Collections.sort(mList, compAsc);
		
		dispList( mList );
		
		// 내림차순 정렬 1
		
		Comparator<Member> comDesc = new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {
				return o2.getMno() -o1.getMno();
			}
		};
		
		Collections.sort(mList, comDesc);
		
		dispList( mList );
		/*
		// 내림차순 정렬 2
		Collections.sort(mList, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				
				return o2.getMno() - o1.getMno();
			}
			
		});
		
		dispList( mList );
		*/
		
		// 내림차순 정렬 3
		
		Collections.sort(mList, (a, b)-> {return b.getMno() - a.getMno(); });
		
		dispList( mList );
	}

	private static void dispList(List<Member> mList) {
		
		for (Member member : mList) {
			System.out.print( member.getMno() + " " ); // .getMno() 때문에 숫자만 출력
		}
		System.out.println();
	}

}




































