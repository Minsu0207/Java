package test;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		
		
		int avr=(num1+num2+num3)/3;
						
		
		if (avr>=70 && num1>60 && num2>60 && num3>60) {
						System.out.println("평균점수는"+avr+"입니다, 결과는 통과입니다.");
		} else {
			System.out.println("평균점수는"+avr+"입니다, 결과는 과락입니다.");
		}
			
	
	}
}
