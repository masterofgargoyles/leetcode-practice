import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[]a = new int [3];
    for(int i=0;i<3;i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the target : ");
    int target = sc.nextInt();
    twoSum(a,target);
    sc.close();
  }

  public static int[] twoSum(int[] a, int target){
    int[] b= new int[2];
    for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]+a[j]==target){
          b[0] = i;
          b[1] = j;
        }
      }
    }
    System.out.print(b[0]+" "+b[1]);
    return b;
  }
}