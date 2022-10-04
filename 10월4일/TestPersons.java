package test;

abstract class Person{
	private String pno;
	private String pname;
	private int age;
	abstract void show(); //toString()를 호출하여 sysout으로 처리
	abstract void increase();//salary, scholarship, or dayPay를 10% 증가
	
	public Person(String pno, String pname, int age) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.age = age;
	}


	public String toString() {
		return pno;	
	}
}


class Student extends Person{
	//
	private String schoolName;
	private int schoolYear;
	private int scholarship;
	public Student(String pn, String name, String sn, int a, int sy) {
		super(pn,name,a);
		schoolName = sn; schoolYear = sy;
	}

	public String toString() {
		return super.toString() +"schoolName" + schoolName;
	}
	public void show() {
		super.show();
		System.out.println(toString());
	}

}
	

class WorkStudent extends Student{
	private String Job; 
	int dayPay;
	public WorkStudent(String pn, String name, int a, String sname, int syear) {
		super(pn,name,sname,a,syear);
		
	}
	

}

class Employee extends Person {
	String job; 
	String dept; 
	int salary;
	
	public Employee(String pno, String pname, int age, String job, String dept, int salary) {
		super(pno, pname, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void increase() {
		// TODO Auto-generated method stub
		
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
	
}


public class TestPersons {
	static showAll(Person[] p) {
		for (int 1 = 0; i<p.length; i++) {
			p[i].show(); // 동적바인딩 구현
		
		}
		
		System.out.println();
	}

	public static void getData(Person[] p) {
		Employee e = new Employee(“p01”,”Hong”, 10, “DB”, “Design”, 2000);
		Designer d = new Designer(“p02”,”Hong”, 10, “DB”, “Design”, 2000);
		Student s = new Student(“p03”,”Hong”, 10, “DB”, “Design”, 2000);
		WorkStudent w = new WorkStudent(“p04”,”Hong”, 10, “DB”, “Design”, 2000);
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
		showAll(setPerson);
	}

}