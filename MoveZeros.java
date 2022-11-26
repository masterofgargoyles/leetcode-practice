import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the arrray : ");
    int l =sc.nextInt();
    int[] a = new int[l];
    System.out.println("Enter the elements of the array : ");
    for(int i =0;i<l ;i++){
      a[i] = sc.nextInt();
    }
    moveZeros(a);
    sc.close();
  }
  public static void moveZeros(int [] a){
    int l = a.length;
    int temp =0;
    for(int i=0;i<l;i++){
      if(a[i]==0){
        for(int j=i;j<l;j++){
          if(a[j]!=0){
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            break;
          }
        }
      }
    }
    for(int i=0;i<l;i++){
      System.out.print(a[i]+" ");
    }
  }
}