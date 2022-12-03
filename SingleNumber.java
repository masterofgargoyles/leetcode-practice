import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] nums ={4,1,2,1,2};
    System.out.print(singleNumber(nums));
  }

  public static int singleNumber(int[] nums){
    if(nums.length==1){
      return nums[0];
    }
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]!=nums[i+1])return nums[i];
      else{
        i++;
      }
    }
    return nums[nums.length-1];
  }
}