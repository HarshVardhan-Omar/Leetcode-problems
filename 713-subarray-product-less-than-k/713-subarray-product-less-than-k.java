class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
            int n=nums.length;
            if(k<=1){
                    return 0;
            }
            int left=0;
            int ans=0;
            int prod=1;
            for(int i=0;i<n;i++){
                    prod*=nums[i];
                    while(prod>=k){
                            prod/=nums[left++];
                            
                    }
                    ans+=i-left+1;
            }
            return ans;
            
        
    }
}