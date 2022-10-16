package edu;

public class Arrays2Dsum {
		public static void main(String[] args) {
			int[][] num = {
							{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40}
			};
			
			int sum=0;
			
			for(int i=0; i<num.length; i++) {
				for(int j =0; j<num[i].length; j++) {
					System.out.printf("num[%d][%d]=[%d]%n",i,j,num[i][j]);
					sum=sum + num[i][j];
				}
			}
			System.out.println(sum);
		}
		
}
