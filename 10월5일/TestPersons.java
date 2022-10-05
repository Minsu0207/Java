package test;

import javax.management.openmbean.OpenDataException;

abstract class Person{
	private String pno;
	private String pname;
	private int age;
	abstract void show(); //toString()를 호출하여 sysout으로 처리
	abstract int increase();//salary, scholarship, or dayPay를 10% 증가

	public Person(String pno, String pname, int age) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.age = age;
	}


	public String toString() {

		return "pno= "+pno+", pname= " +pname+ " age= " + age;	
	}

}


class Student extends Person{

	private String schoolName;
	private int schoolYear;
	private int scholarship;
	public Student(String pno, String name,int age, String sn, int sy, int ss) {
		super(pno,name,age);
		schoolName = sn; schoolYear = sy; scholarship=ss;
	}

	public String toString() {
		return super.toString() +" schoolName = " + schoolName+" schoolYear = " + schoolYear + " schoarship = " + scholarship; 
	}
	public void show() {

		System.out.println(toString());
	}


	public int increase() {
		return scholarship *= 1.1;
	}

}


class WorkStudent extends Student{
	private String Job; 
	int dayPay;
	public WorkStudent(String pno, String name, int age, String sname, int syear, int daypay) {
		super(pno,name,age,sname,syear,daypay);
	}

	public int increase() {
		return dayPay *= 1.1;

	}
}

class Employee extends Person {
	private String schoolName;
	private int schoolYear;
	private String job; 
	private String dept; 
	int salary;

	public Employee(String pno, String pname, int age, String job, String dept, int salary) {
		super(pno, pname, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

	public String toString() {
		return super.toString() +" job= "+job +" dept= " +dept +" salary= " +salary;

	}


	void show() {
		System.out.println(toString());

	}

	int increase() {
		return salary *= 1.1;
	}



}

class Designer extends Employee {
	String language; 
	int workYear;
	public Designer(String pno, String pname, int age, String job, String dept, int salary, String language, int workYear) {
		super(pno, pname, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}

	public String toString() {
		return super.toString()+" language= " +language + " workYear= " +workYear;

	}


	public void show() {
		System.out.println(toString());
	}
	public int increase() {
		return salary *= 1.1;
	}


}


public class TestPersons {
	static void  increaseAll(Person[] p) {

		for (int i = 0; i<p.length; i++) {
			p[i].increase();

		}
	}

	static void  showAll(Person[] p) {

		for (int i = 0; i<p.length; i++) {
			p[i].show(); // 동적바인딩 구현

		}
	}


	public static void getData(Person[] p) {
		Employee e = new Employee("p01","Hong",20,"회사원","Computer",300);
		Designer d = new Designer("p02","Lee", 25, "디자이너", "Design", 400, "영어", 5);
		Student s = new Student("p03","Kim", 35, "부산대학교", 2007,200);
		WorkStudent w = new WorkStudent("p04","Gu", 20, "홍익대학교", 2020,100);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;

	}
	public static void main(String[] args) {
		Person [] setPerson = new Person[4];
		getData(setPerson);
		showAll(setPerson);
		increaseAll(setPerson);
		System.out.println("=============================================================================================");
		showAll(setPerson);
		
	}

}