package com.ruby.java.ch06;
class Point {
	private int x,y;
	public void setPoint(int a, int b) {
		this.x=a;								//() {} 사용법 괄호 비울때, 채울때
		this.y=b;
	}
	public void getPoint() {
			System.out.print(x);
			System.out.print(",");
			System.out.println(y);
			
		}
	
}

class ColorPoint extends Point {
	private String color;
	private void setColor(String C) {
		this.color = C;
	}
	private void getColor() {
		System.out.println(color);
		// return color;
	}
	public void setColorPoint(int a, int b, String c) {
			setPoint(a,b);
			setColor(c);
	}
	public void getColorPoint() {
		getPoint();
		getColor();
		
	}
}

public class TestPoint0926 {
		public static void main(String[] args) {
			Point p = new Point();
			ColorPoint p1 = new ColorPoint();
			p.setPoint(1, 2);
			p.getPoint();
			p1.setColorPoint(3,4,"red");
			p1.getColorPoint();
			System.out.println();
		

	}
}




// https://velog.io/@nathan29849/Java-%EC%9D%B8%EC%9E%90-%EC%A0%84%EB%8B%AC-%EB%B0%A9%EB%B2%95
// 자바 인자전달 방법
//set,get 포인트안쓰고 super 써서 생성자 해보기