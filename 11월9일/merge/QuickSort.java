import java.util.Stack;

public class QuickSort {
    /**
     * @param args
     * @throws Exception
     */

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    } 
    //array, left 범위, right 범위
    static void quicksort(int[] a, int left, int right) {
        Stack<Point> stack = new Stack<>();
        Point p = new Point(left, right);

        stack.push(p);

        while(stack.isEmpty() == false) {
            int pl, pr;//비교 가늠자
            Point item = stack.pop();
            // 범위와 가늠자 일치 [ex) 사이즈 8 배열 일 경우범위 및 가늠자 pl = 0, pr = 8로 일치]
            left = pl = item.getX();
            right = pr = item.getY();
            int m = a[(left + right) / 2];//배열 중간의 값[ex) 8배열일 경우 (0+8)/2=4] 을 기준값으로 설정

            do {
                //pl 가늠자를 움직이면서 기준값(m)보다 큰 값을 탐색
                while(a[pl] < m) pl++;
                //pr 가늠자를 움직이면서 기준값(m)보다 작은 값을 탐색
                while(a[pr] > m) pr--;
                //각 가늠자와 기준값(m) 사이에서 찾은 값을 교체
                if(pl <= pr) swap(a, pl++, pr--);
                //pl, pr이 기준값 사이에 있는 동안 계속 반복
            }   while(pl <= pr);

            //left와 기준값(m) 사이를 잘라서 스택에 저장
            if(left < pr) {
                stack.push(new Point(left, pr));
            }
            //기준값(m)과 right 사이를 잘라서 스택에 저장
            if(pl < right) {
                stack.push(new Point(pl, right));
            }
        }
    }

    static void print(int[] arr) {
        System.out.print("[");
        for(int i=0; i< arr.length; i++)    System.out.print(" "+ arr[i]);
        System.out.print(" ]");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int[] a = {5,8,4,2,6,1,3,9,7};

        quicksort(a, 0, 8);//
        print(a);
    }
}
