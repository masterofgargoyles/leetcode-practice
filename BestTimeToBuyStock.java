class Main {
  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    System.out.println(maxProfitThree(prices));
  }

  public static int maxProfit(int[] prices){
    int maxDiff=0;
    int diff;
    for(int i=0;i<prices.length-1;i++){
      for(int j=i+1;j<prices.length;j++){
        diff = prices[j] - prices[i];
        if(maxDiff<diff){
          maxDiff = diff;
        }
    }}
    return maxDiff;
  }

  public static int maxProfitTwo(int[] prices){
    int maxDiff = 0;
    int diff;
    int l = 0;
    int r = prices.length-1;
    while(l<r){
      diff = prices[r] - prices[l];
      if(maxDiff<diff){
        maxDiff = diff;
      }
      r--;
      if(l==r){
        l++;
        r=prices.length-1;
      }
    }
    return maxDiff;
  }

  public static int maxProfitThree(int[] prices){
    int minValue = Integer.MAX_VALUE;
    int p = 0;
    int o =0;
    for(int i =0;i<prices.length;i++){
      if(prices[i] < minValue){
        minValue = prices[i];
      }
      p = prices[i] - minValue;
      if(o<p){
        o = p;
      }
    }
    return o;
  }
}