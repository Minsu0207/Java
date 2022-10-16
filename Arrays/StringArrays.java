package edu;

import java.util.Arrays;

public class StringArrays {
	public static void main(String[] args) {
		String[] Arr1 = new String[3];
		Arr1[0]="kim";
		Arr1[1]="Park";
		Arr1[2]="Yi";
		
		//위에껄 줄여서 아래처럼 표현가능
		String[] Arr ={"가위","바위","보"};
		System.out.println(Arrays.toString(Arr));
		
		
		for(int i =0; i<10; i++) { 
		int tmp=(int)(Math.random()*3);
		 System.out.println(Arr[tmp]);
		}
		
	}
}
