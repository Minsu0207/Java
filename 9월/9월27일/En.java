package com.ruby.java.ch06;

public class En {
	int max;
	int min;
	int gcd;
	int lcm;
	
	public En(int a, int b) {
		this.max=a;
		this.min=b;
	}
	public void Find(){
		if (max < min) {
			int temp;
			temp = max;
			max = min;
			min = temp;
		}
		
		int rem;   
		int gcd = 0;
		int lcm = 0;
		int c=max;
		int d=min;
		while(true) {
			rem=c%d;
			if(rem==0) {
				gcd = d;
				lcm = max*min/gcd;
				break;
			}
			else{
				c=d;
				d=rem;
			}
		}
		this.gcd=gcd;
		this.lcm=lcm;
	}
	
	public void Print() {
		System.out.println(gcd+","+lcm);		
	}
}
