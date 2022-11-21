import java.util.Scanner;

public class q1 {

  static int min(int a, int b, int c, int d) {
    int min = 0;
    if (a > b) {
      min = b;
    } else {
      min = a;
    }
    if (c < min) {
      min = c;
    }
    if (d < min) {
      min = d;
    }
    return min;
  }

  public static void main(String[] args) {
    Scanner Int = new Scanner(System.in);
    int a, b, c, d;

    a = Int.nextInt();
    b = Int.nextInt();
    c = Int.nextInt();
    d = Int.nextInt();

    int min = min(a, b, c, d);

    System.out.println("최소값은" + min);
  }

}