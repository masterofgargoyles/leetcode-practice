class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static int richest(int[][] a){
    int col = a.length;
    int sum =0;
    int max =0;
    int[] b = new int [col];
    for(int i=0;i<col;i++){
      sum =0;
      for(int j=0;j<a[i].length;j++){
        sum = sum + a[i][j];
        b[i] = sum;
      }
    }
    for(int i=0;i<b.length;i++){
      if(max<b[i]){
        max = b[i];
      }
    }
    return max;
  }
}