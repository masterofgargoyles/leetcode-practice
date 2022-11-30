class Main {
  public static void main(String[] args) {
    int a[] = {1,3};
    System.out.println(searchInsert(a,2));
  }

  public static int searchInsert(int []nums, int target){
    int length = nums.length;
    int mid = length/2;
    if(nums[0]>=target){
      return 0;
    }
    else if(nums[mid]>target){
      for(int j=0;j<=mid;j++){
        if(nums[j]==target){
          return j;
        }
        else if(nums[j]>target){
          return j;
        }
      }
    }
    else if(nums[mid]==target){
      return mid;
    }
    else if(nums[mid]<target){
      for(int i=mid;i<length;i++){
        if(nums[i]==target){
          return i;
        }
        else if(nums[i]>target){
          return i;
        }
      }
    }
    return length;
  }
}