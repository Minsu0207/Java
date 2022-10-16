package edu;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {

		int [] arr = {0,1,2,3,4,5};
		int[][]arr2D= {
				{11,22},
				{21,22}
		};
		//1차원 배열 출력
		System.out.println(Arrays.toString(arr));
		//다차원 배열 출력
		System.out.println(Arrays.deepToString(arr2D));

		String[][]str2D = new String[][] {
											{"aaa","bbb"},
											{"ccc","ddd"}
										};
											
		String[][]str2D2 = new String[][] {
											{"aaa","bbb"},
											{"ccc","ddd"}
										};
		//1차원 배열의 같이 같은지 같으면 True 다르면 Flase 아래는 2차원이라서 같지만 펄스
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		
		int arrr [] = {0,1,2,3,4};
		int [] arrr2 = Arrays.copyOf(arrr, arr.length); //[0,1,2,3,4]
		int [] arrr3 = Arrays.copyOf(arrr, 7);//[0,1,2,4,0,0]
		int [] arrr4 = Arrays.copyOfRange(arrr, 2,4); // [2,3] from2  to4
		
		//배열의 정렬
		int [] arrrr= {3,2,0,1,4};
		Arrays.sort(arrrr);
		System.out.println(Arrays.toString(arrrr));
	}
}
