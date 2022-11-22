import java.util.*;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the x coordinate : ");
    int x = sc.nextInt();
    System.out.println("Enter the y coordinate : ");
    int y =sc.nextInt();
    System.out.println("Enter the points : ");
    int [][] p = new int [1][2];
    for(int i=0;i<5;i++){
      for(int j=0;j<2;j++){
        p[i][j] = sc.nextInt();
      }
    }
    System.out.println("The minimum manhattan distance is : "+nearstValidPoint(x,y,p));
    sc.close();
  } 

  public static int nearstValidPoint(int x,int y, int[][] p){
    int flag = 0;
    int min = 99999999;
    int md;
    int smallestIndex=0;
    for(int i=0;i<p.length;i++){
      if(p[i][0]==x || p[i][1]==y){
         flag = 1;
          md = Math.abs((p[i][0] - x) + (p[i][1] - y));
          if(min > md){
            // System.out.println("The point is : "+p[i][0]+" "+p[i][1]);
            smallestIndex = i;
            min = md;
          }
      }
    }
    if(flag==0){
      return -1;
    }
    else{
      return smallestIndex;
    }
  }        
}                  
        
        
          
          
              