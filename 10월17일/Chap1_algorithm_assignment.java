package 자바자료구조;

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
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");
		//스트링타입 어레이리스트 생성 변수명 arraylist1
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("로마");
		list2.add("서울");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add("런던");
		//어레이리스트는 가변배열 add와 remove로 유동적으로 변수추가삭제
		//어레이 통해서 merge 합쳐서 중복제거
		//다음시간 객체 배열
		list2.add(1, "LA");


		System.out.println("정렬전::");

		System.out.println(list1);
		System.out.println(list2);

		//정렬
		Collections.sort(list1);
		Collections.sort(list2);
		

		System.out.println("정렬후::");

		//list11배열생성해서 arraylist를 list11 배열로 변환
		String list11[]=new String[0];
		list11 = list1.toArray(list11);

		//변수명 list22이라는 배열 생성   스트링뒤에[0]이 의미하는값 물어보기 초기화? 크기 지정? 
		String list22[]=new String[0];
		//toArray함수를 사용해서 list2을 Array로 변환
		list22 = list2.toArray(list22);
		//출력해서 확인
		System.out.println(list1);
		System.out.println(list2);

		System.out.println("중복제거후::");
		list11=removeDuplicate(list11);
		list22=removeDuplicate(list22);

		System.out.println(Arrays.toString(list11));
		System.out.println(Arrays.toString(list22));

		System.out.println();
		System.out.println();
		//기존 배열list11을 asList함수를 사용해서 ArrayList로 변환 
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(list11));
		
		
//		list3.addAll(list1);
//		list3.addAll(list22);
		//list3에 list1+list2 복사
//		Collections.addAll(list3, list1.toArray(new String[0]));
		Collections.addAll(list3, list2.toArray(new String[0]));

		Collections.sort(list3);
		System.out.println(list3);
		
//		System.out.println("새로운 어레이 리스트2 출력");
//		System.out.println(list3);
		
		list1=new ArrayList<String>(Arrays.asList(list11));
		list2=new ArrayList<String>(Arrays.asList(list22));
		
		//이터레이터 리스트두개 비교해서 작은거를 list3에 복사 (아마컴페어온?그런거) 
		
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList(list11));
		
		Iterator<String>iter1=list1.iterator();
		Iterator<String>iter2=list2.iterator();
		
		String st1=iter1.next();
		String st2=iter2.next();
		while(iter1.hasNext() && iter2.hasNext()) {
			if(st1.compareTo(st2)<0) {
				list4.add(st1);
				st1=iter1.next();
			}else if(st1.compareTo(st2)>=0) {
				list4.add(st2);
				st2=iter2.next();
			}
			
//			System.out.println(list4);
			
		}
		
	


	}
}