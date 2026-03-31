package sort;

import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		
		// 정렬 : Sort
		// int [](int 식 배열)은 람다식 사용불가
		int [] arr1 = new int[] {1, 5, 3, 2, 4};
		System.out.println(Arrays.toString(arr1)); // [1, 5, 3, 2, 4]
		Arrays.sort(arr1); // 정렬
		System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 4, 5]
		// Arrays.sort(arr1, (a, b) -> {return b - a; }); // error
		//The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], (<no type> a, <no type> b) -> {})
		
		System.out.println("====================================================================================");
		
		Integer [] arr2 = new Integer[] {1, 5, 3, 2, 4};
		System.out.println(Arrays.toString(arr2)); // [1, 5, 3, 2, 4]
		Arrays.sort(arr2, (a, b) -> {return b - a; });
		System.out.println(Arrays.toString(arr2)); // [5, 4, 3, 2, 1] - 오름차순 정렬이 된 모습
		Arrays.sort(arr2, (a, b) -> {return a - b; });
		System.out.println(Arrays.toString(arr2)); // [1, 2, 3, 4, 5] - 내림차순 정렬이 된 모습
		System.out.println("====================================================================================");
		
		Double [] arr3 = { 12.3, 3.8, 2.145, 16.8 };
		System.out.println(Arrays.toString(arr3)); // [12.3, 3.8, 2.145, 16.8]
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3)); // [2.145, 3.8, 12.3, 16.8]
		Arrays.sort(arr3,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr3)); // [16.8, 12.3, 3.8, 2.145]
		System.out.println("====================================================================================");
		
		String [] names = {"유진", "카리나", "윈터", "가을", "이서"};
		System.out.println(Arrays.toString(names)); // [유진, 카리나, 윈터, 가을, 이서]
		Arrays.sort( names, (a,b) -> {return a.compareTo(b); }); // 문자열 비교는 역시? .compareTO()
		System.out.println(Arrays.toString(names)); // [가을, 윈터, 유진, 이서, 카리나]
		Arrays.sort( names, (a,b) -> {return b.compareTo(a); });
		System.out.println(Arrays.toString(names)); // [카리나, 이서, 유진, 윈터, 가을]
		

	}

}































