package edu;

import java.util.Arrays;

public class Arrays2D {
	public static void main(String[] args) {
			//4행 4열 2차원 배열 생성
		int [][] score = new int[4][3];
		score[0][0] = 100;
		System.out.println(score[0][0]);
		
			//2차원 배열의 초기화
		int[][]arr = {
						{1,2,3},
						{4,5,6}
					 };
	}
}







//                열 index
//   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//  score[0][0]  score[0][1]  score[0][2]   ㅣ
//  score[1][0]  score[1][1]  score[1][2]   ㅣ  행 index
//  score[2][0]  score[2][1]  score[2][2]	ㅣ
//  score[3][0]  score[3][1]  score[3][2]	ㅣ
