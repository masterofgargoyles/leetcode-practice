class Main {
  public static void main(String[] args) {
    int [][]a = { { 1, 1, 1, 1 },
                      { 1, 1, 1, 1 },
                      { 1, 1, 1, 1 },
                      { 1, 1, 1, 1 } };
    System.out.println(matrixSum(a));
  }

  public static int matrixSum (int[][] a){
    int  r = a.length;
    int  c = a[0].length;
    int principle = 0;
    int seconday = 0;
    for(int i =0;i<r;i++){
      for(int j=0;j<c;j++){
        if(i==j){
          principle = principle + a[i][j];
        }
        else if((i+j)==(r-1)){
          seconday = seconday + a[i][j];
        }
      }
    }
    return principle+seconday;
  }
}