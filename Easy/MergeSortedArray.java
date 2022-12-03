import java.util.*;
class Main {
  public static void main(String[] args) {
    int [] num1 = {1,2,3,0,0,0};
    int [] num2 = {2,5,6};
    int m = 3;
    int n = 3;
    merge (num1,m,num2,n);
  }

  public static void merge (int[] num1, int m, int[] num2, int n){
    for(int i=0;i<n;i++){
      num1[m+i] = num2[i];
    }
    Arrays.sort(num1);
    for(int i=0;i<m+n;i++){
      System.out.println(num1[i]);
    }
  } 
}