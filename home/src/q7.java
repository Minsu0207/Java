import java.util.Scanner;

public class q7 {
  static  int totalsum (int a){
  int sum= (a*(a+1))/2;
  return sum;
}

  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  
  int sum = totalsum(a);
  System.out.println(sum);
  }
}
