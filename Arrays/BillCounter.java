package edu;

import java.util.Scanner;

public class BillCounter {
	public static void main(String[] args) {
		//필요한 지폐수 구하기, 5만,1만,5천,1천
		//입력한 값을 가져올 객채 생성
		Scanner sc = new Scanner(System.in);
		//입력한 값 변수에 저장
		int money = sc.nextInt();
		//지폐값 변수 선언
		int a = 50000;
		int b = 10000;
		int c = 5000;
		int d = 1000;
		//몫과 나머지 값 가져올 변수 지정
		//a= 5/2  a=2 몫,   b=5%2 b=1나머지   
		int i = money/a;  int i1=money%a; 
		int j = i1/b; int j1=i1%b;	
		int k = j1/c; int k1=j1%c;
		int m = k1/d; int m1=k1%d;
		//출력		
		System.out.println("필요한 5만원권 "+i+"장");
		System.out.println("필요한 1만원권 "+j+"장");
		System.out.println("필요한 5천원권 "+k+"장");
		System.out.println("필요한 1천원권 "+m+"장");
		
	}
}
