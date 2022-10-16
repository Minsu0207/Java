package edu;

import java.util.Arrays;

public class Lotto {
//로또번호 6개 생성
	public static void main(String[] args) {


		int [] Array = new int[45];
		for(int i=0; i<Array.length; i++) {
			Array[i]=i+1;
			
		}
		int j=0;
		int tep=0;
		for(int i=0; i<6; i++) {
			 j = (int)((Math.random()*45));	 	//0<ran<1  0<ran<45
			 tep=Array[i];
			 Array[i]=Array[j];
			 Array[j]=tep;
			 System.out.println(Arrays.toString(Array));
		}
		for(int i=0; i<6; i++) {
		System.out.printf("ball[%d]=%d%n",i,Array[i]);
		}
		
		
		
		//i가 0일때 1~45중에난수 생성 한개 j에 들어감
		//첫번재 자리에 있던1은 tem에 저장
		//난수 생성된 j가 [0]번째 배열에 저장됨
		//1이 j번째 자리에 저장됨
		
		

		
	}
}

