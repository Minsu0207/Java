package 자바자료구조;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Test1");
		aList.add("Test2");
		aList.add("Test3");
		String[] array = aList.toArray(new String[aList.size()]);
				
		
		System.out.println(aList);
	}
}
