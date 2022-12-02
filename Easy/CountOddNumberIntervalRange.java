import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the low");
    int low = sc.nextInt();
    System.out.println("Enter the high");
    int high = sc.nextInt();

    // calling the function
    System.out.println("The number of odd between "+low+" and "+high+" is :"+countOdds(low,high));

    sc.close();
    
  }

  public static int countOdds(int low, int high) {
    int count = 0;
    for (int i = low; i <= high; i++) {
      if (i % 2 != 0) {
        count++;
      }
    }
    return count;
  }
}
