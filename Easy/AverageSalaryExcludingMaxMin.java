import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the array :");
    int[] a = new int[3];
    for (int i = 0; i < 3; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("The average is : " + average(a));
    sc.close();
  }

  public static double average(int[] salary) {
    int max = salary[0];
    int min = salary[0];
    int length = salary.length - 2;
    double average = 0;
    for (int i = 0; i < salary.length; i++) {
      if (salary[i] < min) {
        min = salary[i];
      } else if (salary[i] > max) {
        max = salary[i];
      }
    }
    for (int i = 0; i < salary.length; i++) {
      if (salary[i] != min && salary[i] != max) {
        average = average + salary[i];
      }
    }
    // System.out.println(average + " " + length);
    average = average / length;
    return average;
  }
}
