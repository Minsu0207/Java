package test;

public class Test3 {
	public static void main(String[] args) {
		int score = 59;
		String grade;
		
		if(score>=95) {
			grade="A+";
		}
		else if(score>=90) {
			grade="A";
		}
		else if(score>=85) {
			grade="B+";
		}
		else if(score>=80) {
			grade="B";
		}
		else if(score>=75) {
			grade="C+";
		}
		else if(score>=70) {
			grade="C";
		}
		else {
			grade="F";
		}
		System.out.println("당신의 학점등급은 " + grade +"학점 입니다.");
	} 
			
}