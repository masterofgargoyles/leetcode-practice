import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println(stringSwapable("kelb","kelb"));
  }

  public static boolean stringSwapable(String s, String p){
    String q = p;
    char [] sc = s.toCharArray();
    // char [] pc = p.toCharArray();
    char [] qc = q.toCharArray();
    if(Arrays.equals(sc,qc)){
      return true;
    }
    int count = 0;
    char temp;
    if(s.length()==p.length()){
      while(count<1){
        for(int i=0;i<q.length()-1;i++){
          for(int j=i+1;j<q.length();j++){
            temp = qc[i];
            qc[i] = qc[j];
            qc[j] = temp;
            // for(int k=0;k<q.length();k++){System.out.println(qc[k]);}
            if(Arrays.equals(sc,qc)){
              return true;
            }
            else{
              qc = p.toCharArray();
            }
          }
        }
        count ++;
      }
    }
    return false;
    
  }
}