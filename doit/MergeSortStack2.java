package doit;

import java.util.Stack;

public class MergeSortStack2 {

	static void merge(int[] a, int lefta, int righta, int leftb, int rightb ) {
	}
	

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int [] a, int idx1, int idx2) {
		int t   = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 퀵 정렬(비재귀 버전)---//
	static void MergeSort(int[] a, int left, int right) {
		//스택생성 
		Stack<Point> st = new Stack<>();
		//left right 값 객채생성
		Point pt = new Point(left, right);
		st.push(pt);
		
		while (st.isEmpty() != true) {

			Point item = st.pop();
			//pop해서 pointx의 값을 left에 대입
			int pl = left = item.getX();
			//pop해서 pointy의 값을 right에 대입
			int pr= right = item.getY();
			//중간값 지정
			int x = a[(left+right)/2];

			do {
				//왼쪽 a[0]부터 중간 x보다 작으면 넘어감
				while (a[pl] < x)pl++;
				while (a[pr] > x)pr--;

				if (pl <= pr)
					swap(a, pl++, pr--);
			}while (pl<=pr);

			if (left < pr) {
				st.push(new Point(left, pr));
            }
			
			if (pl < right) {
				st.push(new Point(pl, right));
			}
		}
	}

	public static void main(String[] args) {
		int nx = 30;
		int[] x = new int[30];
		for (int ix = 0; ix < 30; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 50);
		}

		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		MergeSort(x, 0, nx-1); // 배열 x를 퀵정렬
		

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
