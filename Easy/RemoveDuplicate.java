class Main {
  public static void main(String[] args) {
    int[] a = {3,2,2,3};
    removeElement(a,3);
  }

  public static int removeElement(int[]nums ,int val){
    if(nums.length==0)return 0;
    int j=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]!=val){
        nums[j++] = nums[i];
      }
    }
    return j;
    
  }
}