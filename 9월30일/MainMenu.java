package com.ruby.java.ch07;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
	public static void main(String[] args) {
		Menu m []  = new Menu[6];
		m[0] = new Juice("오렌지 쥬스",3500);
		m[1] = new Coffee("아이스 아메리카노",2000);
		m[2] = new Beer("테라",3500);
		m[3] = new Water("삼다수",2000);
		m[4] = new Tea("옥수수수염차",2000);
		m[5] = new Soju("좋은데이",3000);
		for(Menu t : m) {
			t.selmenu();
		}
		System.out.println("---------------");
		{
			List<Menu> list = new ArrayList();
			list.add(new Juice("오렌지 쥬스",3500));
			list.add(new Coffee("아이스 아메리카노",2000));
			
		for(Menu t : list) {
			t.selmenu();
		}
		}
	}

}

class Menu{
	private String name;
	private int price;

	public Menu() {
		name="";
		price = 0;
	}

	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void selmenu() {
		System.out.printf("%s를 선택했습니다. 가격은 %d 입니다.",name,price);
	}

}

class Juice extends Menu {
	public Juice(String name, int price) {
		super(name,price);
	}
	public void selmenu() {
		System.out.print("<JUICE>");
		super.selmenu();
		System.out.println();
	}
}

class Coffee extends Menu {
	public Coffee(String name, int price) {
		super(name,price);
	}
	public void selmenu() {
		System.out.print("<Coffee>");
		super.selmenu();
		System.out.println();
	}
}

class Beer extends Menu {
	public Beer(String name, int price) {
		super(name,price);
	}
	public void selmenu() {
		System.out.print("<BEER>");
		super.selmenu();
		System.out.println();
	}
}

class Water extends Menu {
	public Water(String name, int price) {
		super(name,price);
	}
	public void selmenu() {
		System.out.print("<WATER>");
		super.selmenu();
		System.out.println();
	}
}

class Tea extends Menu {
	public Tea(String name, int price) {
		super(name,price);
	}
	public void selmenu() {
		System.out.print("<TEA>");
		super.selmenu();
		System.out.println();
	}
}

class Soju extends Menu {
	public Soju(String name, int price) {
		super(name,price);
	}
	public void selmenu() {
		System.out.print("<SOJU>");
		super.selmenu();
		System.out.println();
	}
}





