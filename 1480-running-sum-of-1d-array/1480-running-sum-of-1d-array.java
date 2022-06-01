class Solution {
    public int[] runningSum(int[] nums) {
            int [] ans=new int[nums.length];
            
            int sum=0,k=0;
            for(int i=0;i<nums.length;i++){
                    sum+=nums[i];
                    ans[k++]=sum;
            }
            return ans;
        
    }
}