public class MergeSort {
    static int[] merge(int[] larr, int[] rarr) {
        int l = larr.length;
        int s = rarr.length;
        int[] arr = new int[l+s];
        int lp = 0; 
        int sp = 0;
        int n = 0;
        if(l < s) {
            int temp = l;
            l = s;
            s = temp;
        }

        while(n < arr.length) {
            //2-1. lp 배열에 모든 값이 삽입되었을 경우 나머지 sp 배열 삽입        
            if(lp == larr.length) {
                while(sp<rarr.length) {
                    //3-1. n 배열 마지막에는 sp배열의 마지막 값을 삽입
                    if(n == arr.length-1) {
                        arr[n] = rarr[sp];
                        break;
                    }else arr[n++] = rarr[sp++];
                }
                break;
            }
            //2-2. sp 배열에 모든 값이 삽입되었을 경우 나머지 lp 배열 삽입
            if(sp == rarr.length) {
                while(lp<larr.length) {
                    //3-2. n 배열 마지막에는 lp배열의 마지막 값을 삽입
                    if(n == arr.length-1) {
                        arr[n] = larr[lp];
                        break;
                    }else arr[n++] = larr[lp++];
                }   
                break;
            }
            //1. lp, sp 가늠자 크기비교 후 n에 삽입
            if(larr[lp] <= rarr[sp])   arr[n++] = larr[lp++];
            else arr[n++] = rarr[sp++];
        }
        return arr;
    }

    static void mergesort(int[] arr) {
        int num = arr.length % 2;
        int lx, rx, n;

        if(num == 0) {
            lx = arr.length / 2;
            rx = lx;
        } else {
            lx = arr.length / 2;
            rx = lx + 1;
        }
        int[] larr = new int[lx];
        int[] rarr = new int[rx];
        
        for(n = 0; n < (arr.length / 2); n++) larr[n] = arr[n];
        for(int m = n; m < arr.length; m++) rarr[m-(arr.length / 2)] = arr[m];
    
        QuickSort.quicksort(larr, 0, larr.length-1);
        print(larr);
        QuickSort.quicksort(rarr, 0, rarr.length-1);
        print(rarr);
        print(merge(larr,rarr));
    }

    static void print(int[] arr) {
        System.out.print("[");
        for(int i=0; i<arr.length; i++) System.out.print(" "+arr[i]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] x = new int[20];
        
        for (int i=0; i<20; i++) {
            double d = Math.random();
            x[i] = (int)(d*50);
        }

        // int[] lx = new int[10];
        // int[] rx = new int[10];
        // for(int n=0; n<10; n++) lx[n] = x[n];
        // for(int m=0; m<10; m++) rx[m] = x[10+m];

        // print(x);
        // print(lx);
        // print(rx);
        // print(merge(lx,rx));
        mergesort(x);
    }
}
