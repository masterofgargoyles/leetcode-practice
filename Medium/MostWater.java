class Main {
  public static void main(String[] args) {
    int [] a = {1,8,6,2,5,4,8,3,7};
    System.out.println(mostWatertwo(a));
  }

  public static int mostWater(int [] height){
    int l = height.length;
    int max = 0;
    if(l<2){
      return 0;
    }
    else{
      for(int i =0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
          if(height[i]<height[j]){
            if(max < (height[i]*(j-i)))max=(height[i]*(j-i));
          }
          else{
            if(max < (height[j]*(j-i)))max=(height[j]*(j-i));
          }
        }
      }
    }
    return max;
  }

  public static int mostWatertwo(int[] height){
    int r = height.length - 1;
    int  l = 0;
    int max = 0;
    while(l<r){
      int lh = height[l];
      int rh = height[r];
      if(lh<rh){
            if(max < (lh*(r-l)))max=(lh*(r-l));
          }
      else{
        if(max < (rh*(r-l)))max=(rh*(r-l));
      }
    if(lh<rh)l++;
    else r--;
    }
    return max;
  }
}
