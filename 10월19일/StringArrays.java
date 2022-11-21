// package 자바자료구조;

import java.util.Arrays;

public class StringArrays {
	public static void main(String[] args) {
		String[] s1 = { "홍길동", "강감찬", "을지문덕" };
		String[] s2 = { "독도", "울릉도", "한산도" };
		Arrays.sort(s1);
		Arrays.sort(s2);
		// System.out.println(Arrays.toString(s1));
		// System.out.println();

		String[] s3 = new String[7];
		for (String st : s1)
			System.out.println(" " + st);
		System.out.println();
		for (String st : s2)
			System.out.println(" " + st);

		int i = 0, j = 0, k = 0;

		// 이부분 이해 하기
		while (i < s1.length && j < s2.length) {
			if ((s1[i].compareTo(s2[j])) < 0) { // i가 작으면 s3에 s1을 넣고, i가 증가
				s3[k] = s1[i];
				k++;
				i++;
			} else if ((s1[i].compareTo(s2[j])) > 0) { // j가 작으면 s3에 s2을 넣고 j 증가
				s3[k] = s2[j];
				k++;
				j++;
			} else {
				s3[k] = s1[i];
				k++;
				i++;
				j++; // 같으면 둘다 증가
			}
		}
		while (i < s1.length) {
			s3[k] = s1[i];
			k++;
			i++; // 남은값들 처리
		}
		while (j < s2.length) {
			s3[k] = s2[j];
			k++;
			j++;
		}
		System.out.println();
		for (String st : s3)
			System.out.println(" " + st);
	}

}
