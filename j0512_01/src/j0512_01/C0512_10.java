package j0512_01;

import java.util.Arrays;
import java.util.Collections;

public class C0512_10 {

	public static void main(String[] args) {
		int[] arr = {1,11,23,45,2,3,9,5};
		Arrays.sort(arr); //오름차순 정렬
//		Integer[] arr = {1,11,23,45,2,3,9,5};
//		Arrays.sort(arr,Collections.reverseOrder()); //내림차순
		int num = 10;
		//단순for문
		for(int i:arr) {
			System.out.println(i+" ");
		}
		

	}

}
