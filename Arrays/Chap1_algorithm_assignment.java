package edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Chap1_algorithm_assignment {
	public static String[] removeElement(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static String[] removeDuplicate(String[] list) {
		int count = list.length;
		for (int i=0; i<count; i++) {
			int j = i+1;
			while (j<count) {
				if((list[i].compareTo(list[j]))==0) {
					list = removeElement(list, list[j]);
					count--;
				}
				else j++;
			}	
		}
		return list;
	}

	public static void main(String[] args) {
		//스트링타입 어레이리스트 생성 변수명 arraylist
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("서울");
		arraylist.add("북경");
		arraylist.add("상해");
		arraylist.add("서울");
		arraylist.add("도쿄");
		arraylist.add("뉴욕");
		//스트링타입 어레이리스트 생성 변수명 arraylist1
		ArrayList<String> arraylist1 = new ArrayList<>();
		arraylist1.add("로마");
		arraylist1.add("서울");
		arraylist1.add("방콕");
		arraylist1.add("북경");
		arraylist1.add("도쿄");
		arraylist1.add("서울");
		arraylist1.add("런던");
		//어레이리스트는 가변배열 add와 remove로 유동적으로 변수추가삭제
		arraylist1.add(1, "LA");


		System.out.println("정렬전::");

		System.out.println(arraylist);
		System.out.println(arraylist1);

		//정렬
		Collections.sort(arraylist);
		Collections.sort(arraylist1);

		System.out.println("정렬후::");

		//list0배열생성해서 arraylist를 list0 배열로 변환
		String list0[]=new String[0];
		list0 = arraylist.toArray(list0);

		//변수명 list1이라는 배열 생성   스트링뒤에[0]이 의미하는값 물어보기
		String list1[]=new String[0];
		//toArray함수를 사용해서 arraylist1을 Array로 변환
		list1 = arraylist1.toArray(list1);
		//출력해서 확인
		System.out.println(arraylist);
		System.out.println(Arrays.toString(list1));

		System.out.println("중복제거후::");
		list1=removeDuplicate(list1);
		list0=removeDuplicate(list0);

		System.out.println(Arrays.toString(list0));
		System.out.println(Arrays.toString(list1));


		//기존 배열list1을 asList함수를 사용해서 ArrayList로 변환 
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(list1));
		System.out.println();
//		list3.addAll(list0);
		
		System.out.println("새로운 어레이 리스트 출력");
		System.out.println(list3);
		
		String list4[]=new String[0];
	
		System.out.println(Arrays.toString(list4));


	}
}