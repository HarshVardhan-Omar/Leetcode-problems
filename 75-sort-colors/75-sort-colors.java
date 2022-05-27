class Solution {
    public void sortColors(int[] nums) {
            int n=nums.length;
            int low=0,high=n-1,mid=0;
            while(mid<=high){
                    switch(nums[mid]){
                            case 0:{
                                    int temp=nums[mid];
                                    nums[mid]=nums[low];
                                    nums[low]=temp;
                                    mid++;
                                    low++;
                                    break;
                            }
                            case 1:{
                                    mid++;
                                    break;
                            }
                            case 2:{
                                    int temp=nums[mid];
                                    nums[mid]=nums[high];
                                    nums[high]=temp;
                                    high--;
                                    break;
                            }
                                    
                    }
            }
        
    }
}