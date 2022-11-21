
import java.util.Scanner;

public class q8 {
  static int sumof(int a, int b) {
    int sum = 0;
    for (int i = a; i <= b; i++)
      sum = sum + i;

    return sum;

  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int a = stdIn.nextInt();
    int b = stdIn.nextInt();

    int sum = sumof(a, b);
    System.out.println(sumof(a, b));

  }
}
