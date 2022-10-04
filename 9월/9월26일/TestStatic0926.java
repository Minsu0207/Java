package com.ruby.java.ch06;

public class TestStatic0926 {
	static void show(int a[][]) {              //빈괄호에서2 여기 괄호안 바꾸고 끝
			for(int i = 0; i<a.length; i++) 		//for(제어 변수 선언 및 초기화 ; 조건식 ; 증감식++){ 실행문;}
			 for(int j =0; j<a.length; j++) {
				 System.out.println("a[i][j]");
			 }	
			
			
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
			int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
		show(a);				 // 클래스명이라서 같은 클래스내라서 생략가능 // 빈괄호에서 1 여기바꾸고
		TestStatic0926.show(a); 
	}
}
