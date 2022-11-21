import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    int n =sc.nextInt();
    System.out.println("The Product - Sum is : " +subtractProductSum(n));
    sc.close();
  }

  public static int subtractProductSum(int n){
    int product = 1;
    int sum = 0;
    while(n>0){
      int r = n %10;
      product = product * r;
      sum = sum + r;
      n = n/10;
    }
    int answer = product - sum;
    return answer;
  }

}