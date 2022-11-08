package doit;
import java.util.Stack;

public class QuickSort {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    } 

    static void quictsort(int[] a, int left, int right) {
        Stack<Point> stack = new Stack<>();
        Point p = new Point(left, right);

        stack.push(p);

        while(stack.isEmpty() != true) {
            int pl, pr;
            Point item = stack.pop();
            left = pl = item.getX();
            right = pr = item.getY();
            // pr = item.getY();
            // int pl = left = stack.pop().getX();
            // int pr = right = stack.pop().getY();
            int m = a[(left + right) / 2];

            do {
                while(a[pl] < m) pl++;
                while(a[pr] > m) pr--;
                if(pl <= pr) swap(a, pl++, pr--);
            }   while(pl <= pr);

            if(left < pr) {
                stack.push(new Point(left, pr));
            }

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

        quictsort(a, 0, 8);//
        print(a);
    }
}
