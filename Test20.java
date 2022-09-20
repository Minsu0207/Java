package edu;

public class Test20 {

	public static void main(String[] args) {
		int score = 40;
		char grade;
		
		if(score >= 90) {
			grade = 'a';
		} else if(score >=80) {
			grade = 'b';
		} else if(score >=70) {
			grade = 'c';
		} else if(score >=60) {
			grade = 'd';
		} else {
			grade = 'f';
		}
		System.out.println(grade);

	}

}
