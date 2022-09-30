package com.ruby.java.ch07;
class Person{
	private String pno;
	private String pname;
	private int age; //1    
	public Person() {
		pno = null; pname = null; age = 0;
	}

	public Person(String pn) {
		this();;         // pname = null; age=0; 이걸 디스로
		pno = pn; 
	}
	public Person(String pn,String name){
		this(pn);
		pname = name;
	}
	public Person(String pn, String name, int a) {
		this(pn,name);  // pno = pn; pname = name; 이걸 디스로
		age=a;
	}

	public void show() {
		System.out.println("pno="+pno+" pname="+pname+" age="+age);
	}
	public String toString() {
		return pno;	
	}


}
class Student extends Person {
	private String schoolName;
	private int schoolYear;
	public Student (String pn, String name, String sn, int a, int sy) {
		super(pn, name, a);
		schoolName = sn; schoolYear = sy;
	}

	public String toString() {
		return super.toString()+"schoolName" + schoolName;
	}

	public void show() {
		super.show();
		System.out.println("schoolName=" + schoolName + " schoolYear="+schoolYear+"학년");
	}
	public void show(int a) {
		super.show();
		System.out.println(toString());
	}
}


class WorkStudent extends Student {
	private String job;
	private int salary;
	//	public WorkStudent() {job=null; salary=0;}
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay)
	{
		super(pn, name, sname,a, syear);
		job = j; salary=pay;
	}
}
public class ProcessPersons{
	static void display(Person[] p) {
		for (int i = 0; i<6; i++)
			p[i].show();

	}


	public static void main(String[] args) {
		Person list[] = new Person[6];
		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002","Hong");
		Person p3 = new Person("p003","Kim",20);
		Student s1 = new Student("p004","Lee","부산대",35,4);
		WorkStudent ws = new WorkStudent("p001","hong",30,"신라대",3,"code",1000);
		list[0] = p;
		list[1] = p1;
		list[2] = p2;
		list[3] = p3;
		list[4] = s1;
		list[5] = ws;
		display(list);
//		ws.show();
//		p1.show();
//		p2.show();
//		p3.show();
//		s1.show();

	}
}
