package edu;

import java.util.Arrays;

public class IntArrays {
	public static void main(String[] args) {
		int [] Arr1 = new int [5] ; //5개 빈값 배열 생성
		Arr1[0]= 9;
		Arr1[1]= 8;
		Arr1[2]= 7;
		Arr1[3]= 6;
		Arr1[4]= 5;
		
//		위에껀 줄여서 아래처럼 표현가능
		int [] Arr = {9,8,7,6,5} ;
		
		
		System.out.println(Arrays.toString(Arr));
		
		for(int i=0; i<Arr.length; i++ ) {
		System.out.printf("Arr[%d]=%d%n",i,Arr[i]);
		
		}System.out.println(Arr);
	}
}
