class Solution {
    public int findMin(int[] nums) {
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
            return nums[high];
        
    }
}