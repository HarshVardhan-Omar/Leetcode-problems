class Solution {
    public int search(int[] nums, int target) {
            int n=nums.length;
           int pivot=getpivot(nums);
            System.out.println(pivot);
            if(target>=nums[pivot]&&target<=nums[n-1]){
                    return binarysearch(nums,target,pivot,n-1);
            }
            else{
                    return binarysearch(nums,target,0,pivot-1);
            }
        
    }
         private int binarysearch(int[]nums,int target,int start,int end){
              while(start<=end){
                      int mid=start+(end-start)/2;
                      if(nums[mid]==target){
                              return mid;
                      }
                      else if(nums[mid]>target){
                              end=mid-1;
                      }
                      else{
                              start=mid+1;
                      }
              }
                    return -1;
                    
            }
            private int getpivot(int[] nums){
                    int n=nums.length;
            int low=0;
            int high=n-1;
            if(nums[high]>nums[low]){
                    return nums[low];
            }
            while(low<high){
                    int mid=low+(high-low)/2;
                    if(nums[mid]>=nums[0]){
                            low=mid+1;
                    }
                    else{
                            high=mid;
                    }
            }
            return high;
            }
}