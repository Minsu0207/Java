package com.ruby.java.ch06;
	
class Person {
	public Person() {}
	public Person(String s ,int a, String d) {
		name = s; age = a; dept= d;
	}

	private String name;
	private int age;
	private String dept;
	
public class Employee0926 extends Person {
	private int salary;
	public Employee0926(String s, int a, String d, int pay) {
		super(s,a,d);           //super는 첫번째문장
		salary=pay;
		
//		Person(s,a,d);
	}
	
	}
	private String getName() {
         return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge() {
		return age;
	} 
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	
	
	public static void main(String[] args) {
		Employee0926 e = new Employee0926();
		Student2 s2 = new Student2();        // 패키지내에 값들은 다른 선언 없이 불러 쓸수있다.
		s2.setAge(33);
		System.out.println("student2:: age = " + s2.getAge());
		e.setAge(10);
		e.getAge();
		e.setName("Hello");
		System.out.println(e.getAge());
		System.out.println(e.getName());
		
		//age=34;   age는 private 라서 같은 클래스 내가 아니라서 접근불가 로컬변수가 아니라 멤버변수?라
		//System.out.println(age);
		e.age=35;                      //위에껀 안돼지만, 아래껀 객체가 있어서 가능
		System.out.println(e.age);
		
		
	
	}
	
}

// set,get int a = new int, 변수선언,출력
//변수 선언, 값 셋팅 출력 클래스 실습 