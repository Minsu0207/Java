package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	String str =name.next();
	System.out.println("내이름은 " + str);
	
	Scanner num = new Scanner(System.in);
	int age = num.nextInt();
	System.out.println("내나이는 " +age);
	

}
}
