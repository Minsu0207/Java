package 자바자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
public class Chap1 {

//   //교수님 강의
   public static String[] removeElement(String[]arr, String item) {
      List<String> list = new ArrayList<>(Arrays.asList(arr));
      list.remove(item);
      return list.toArray(String[]::new);
   }
//   
//   public static String[] removeDuplicate(String[] lst) {
//      int count = lst.length;
//      for(int i = 0; i < count; i++)
//          for(int j = i+1; j < count; j++)
//          {
//             if(lst[i].compareTo(lst[j])==0) {
//                lst = removeElement(lst, lst[j]);
//                count--;
//                System.out.println("j = "+ j + "count = " + count);
//             }
//          }
//      return lst;
//   }
//   //list removeDup
//   public static ArrayList<String> removeDup(ArrayList<String> st) {
//      for(int n = 0; n < st.size(); n++) {
//         if(n == st.size()-1)
//            if(st.get(n-1) == st.get(n))   st.remove(n);
//            else break;
//         for(int m = n + 1; m < st.size(); m++) {
//            if(st.get(n) == st.get(m))   st.remove(m);
//         }
//      }
//      System.out.println();
//      System.out.println("List :: ");
//       for ( String city: st)
//          System.out.print(city+ " ");
//       return st;
//   }
   
   public static String[] plusElement(String[]arr, String item) {
      List<String> list = new ArrayList<>(Arrays.asList(arr));
      list.add(item);
      return list.toArray(String[]::new);
   }
   
   public static String[] removeDup(String[] st) {
      for(int n = 0; n < st.length; n++) {
         if(n == st.length - 1)
            if(st[n-1] == st[n])   st = removeElement(st, st[n]);
         for(int m = n + 1; m < st.length; m++) {
            if(st[n] == st[m])   st = removeElement(st, st[m]);
         }
      }
      System.out.println();
      System.out.println("Array :: ");
       for ( String city: st)
          System.out.print(city+ " ");
      return st;   
   }
   
   public static String[] Sort(String[] st) {
      String temp = "";
      for(int i = 0; i < st.length; i++)
         for(int j = i + 1; j < st.length; j++)
         {
            if(st[i].compareTo(st[j])>0) {
               temp = st[i];
               st[i] = st[j];
               st[j] = temp;
            }
         }
      System.out.println();
      System.out.println("Array :: ");
       for ( String city: st)
          System.out.print(city+ " ");
      return st;
   }
   
   public static String[] Merge(String[] l, String[] s) {
      String[] st3 = new String[0];
      String[] temp;
      //길이판별
      if(l.length<s.length) {
         temp = l;
         l = s;
         s = temp;
      }
      //긴 배열을 st1에 삽입
      st3 = l;
      //남아있는 list를 list3와 비교하여 없는 항목은 집어넣고 중복된 항목은 버린다.
      for(int i = 0; i < s.length; i++)
         for(int j = 0; j < st3.length; j++) {
            if(s[i] == st3[j])   break;
            else if(j == st3.length - 1) st3 = plusElement(st3, s[i]);
         }
      //확인을 위해 프린트
      System.out.println();
      System.out.println("MergeArray :: ");
       for ( String city: st3)
          System.out.print(city+ " ");
      return st3;
   }
   
   public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<String>();
            list1.add("서울");
            list1.add("북경");
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
            list2.add(1, "LA");
            list2.add("서울");
            list2.add("서울");
            list2.add("서울");
            
            //
            System.out.println("collection.sort()::");
             Collections.sort(list1);
             System.out.println("list1::");
             for ( String city: list1)
                System.out.print(city+ " ");
             System.out.println();
             System.out.println("list2::");
             Collections.sort(list2);
             for ( String city: list2)
                System.out.print(city+ " ");
            ArrayList<String> list3 = new ArrayList<String>();
            
            Iterator<String> iter1 = list1.iterator();
            Iterator<String> iter2 = list2.iterator();
            
            //Array로 merge 와 sort
            //list를 Array로 변환
            String[] st1 = new String[0];
            st1 = list1.toArray(st1);
            String[] st2 = new String[0];
            st2 = list2.toArray(st2);
            
            //st1, st2 중복제거
            st1 = removeDup(st1);
            st2 = removeDup(st2);
            
            //st1과 st2를 정렬
            st1 = Sort(st1);
            st2 = Sort(st2);
            
            //중복제거하며 st1+st2 = st3  
            String[] st3 = Merge(st1, st2);
            st3 = Sort(st3);