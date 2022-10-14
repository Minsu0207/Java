package 자바자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringMerge{
	public static String[] removeElement(String[]arr, String item){
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static String[] removeDuplicate(String[] lst) {
		int count = lst.length;
		for (int i=0; i<count; i++) {
			int j = i+1;
			while (j<count) {
				if((lst[i].compareTo(lst[j]))==0) {
					lst = removeElement(lst, lst[j]);
					count--;
				}
					else j++;
			}	
		}
		return lst;
	}



	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("북경");
		list1.add("서울");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add("서울");
		System.out.print(" 정렬전: ");
		System.out.println();
		for (String city: list1)
			System.out.print(" " + city);
		System.out.println();
		for (String city: list2)
			System.out.print(" " + city);
		Collections.sort(list1);
		Collections.sort(list2); 
		System.out.println();
		System.out.println(" 정렬후"); 
		for (String city: list1)
			System.out.print(" " + city);
		System.out.println();
		for (String city: list2)
			System.out.print(" " + city);
		System.out.println();
		String []lst1 = new String[0];
		lst1 = list1.toArray(lst1);

		String []lst2 = new String[0];
		lst2 = list2.toArray(lst2);
		
		System.out.println(" 중복제거후"); 
		
		lst1=removeDuplicate(lst1);
		lst2=removeDuplicate(lst2);
		
		for (String city : lst1)
			System.out.print(city + " ");
		System.out.println();
		for (String city : lst2)
			System.out.print(city + " ");
		System.out.println();
		

		
		List<String> list3 = new ArrayList<>();
		String []lst3 = new String[0];
		lst1 = list1.toArray(lst1);
		
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
		

		ArrayList<String> list4 = new ArrayList<String>();
        
        Iterator<String> iter1 = list1.iterator();
        Iterator<String> iter2 = list2.iterator();
        
   
		
      //ArrayList->배열->정렬->배열->ArrayList(출력) 개념 잡기
      //merge,sort,collection 해보기
      //list3 합쳐서 중복 제거 





		


			
		


		int count = lst1.length;

		for (int i=0; i<count; i++) {
			int j = i+1;
			while (j<count) {
				if((lst1[i].compareTo(lst1[j]))==0) {
					lst2 = removeElement(lst2, lst1[j]);
					count--;
				}
				else j++;
			}
		}

	}

}

