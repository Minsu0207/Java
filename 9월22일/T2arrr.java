package edu;
import java.util.Scanner;


public class T2arrr {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		int i = sc1.nextInt();
		int j = sc1.nextInt();
		int[][] arr = new int[i][j];
		
				for(int n = 0; n<arr.length; n++) {
					for(int m = 0; m<arr[n].length; m++) {
						
						int a =(int) (Math.random()*100);
						arr[n][m]=a;
						double d=Math.random();
						
					}
				}					


				for(int b = 0; b < arr.length; b++) {
					for(int c = 0; c<arr.length; c++) {
						System.out.print(arr[b][c]);
						System.out.print("\t");
					}
					System.out.println();
				}
     }
}