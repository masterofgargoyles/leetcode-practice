import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array :");
    int len = sc.nextInt();
    int[] a = new int[len];
    System.out.println("Enter the array elements :");
    for (int i = 0; i < len; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println(arraySign(a));
    sc.close();

  }

  public static int arraySign(int[] a) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if(a[i]==0){
        return 0; 
      }
      else if(a[i]<0){
        count ++;
      }
    }
    if(count==1){
      return -1;
    }
    else if(count%2==0){
      return 1;
    }
    else{
      return -1;
    }
    // return product;
  }
}