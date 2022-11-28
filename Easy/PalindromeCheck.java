import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println(isPalindromeWS(121));
  }

  public static boolean isPalindrome(int x){
    String xs = Integer.toString(x);
    char[] c1 = xs.toCharArray();
    char[] c2 = new char [c1.length];
    int k =0;
    for(int i=c1.length-1;i>=0;i--){
      c2[k++] = c1[i];
    }
    if(Arrays.equals(c1,c2)){
      return true;
    }
    return false;
  }

  public static boolean isPalindromeWS(int x){
    int sum = 0;
    if(x<0){
      return false;
    }
    int x2 = x;
    while(x2>0){
      int r = x2%10; //12
      sum = (sum *10) + r; //1
      x2 = x2/10;
    }
    // System.out.println(sum);
    if(sum == x){
      return true;
    }
    return false;
  }
}