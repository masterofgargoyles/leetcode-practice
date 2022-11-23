import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    System.out.println(isHappy(n));
    sc.close();
  }

  public static boolean isHappy(int n){
    Vector<Integer> loopchecker = new Vector<Integer> ();
    while(n>1){
      int nCopy = n;
      int sum = 0;
      while(nCopy>0){
        int r = nCopy%10;
        sum = sum + (r*r);
        nCopy = nCopy/10;
      }
      if(loopchecker.contains(sum)){
        break;
      }
      else{
        if(n!=sum){n = sum;
                 // System.out.println(sum);
                 loopchecker.add(sum);
                }
        else{break;}
      }
      
    }

    if(n==1){
      return true;
    }
    else{
      return false;
    }
    
  }
}