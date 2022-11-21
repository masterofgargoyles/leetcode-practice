import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the array :");
    int[] a = new int[3];
    for (int i = 0; i < 3; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("The largest possible perimeter is : " + largestPerimeter(a));
    sc.close();
  }

  public static int largestPerimeter(int[] A) {
    Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; --i)
            if (A[i] + A[i+1] > A[i+2])
                return A[i] + A[i+1] + A[i+2];
        return 0;

  }
}