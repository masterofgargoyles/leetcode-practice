import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int l = sc.nextInt();
    int[] a = new int [l];
    System.out.println("Enter the elements of the array : ");
    for(int i =0;i<l;i++){
      a[i] = sc.nextInt();
    }
    System.out.println(canMakeArithmeticProgression(a));
    sc.close();
  }

  public static boolean canMakeArithmeticProgression(int [] a){
    Arrays.sort(a);
    for(int i=0;i<a.length-2;i++){
      if(a[i+1]-a[i]!=a[i+2]-a[i+1]){
        return false;
      }
    }
    return true;
  }
}