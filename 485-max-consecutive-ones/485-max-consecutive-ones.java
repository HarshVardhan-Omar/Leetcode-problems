class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
            int c=0;
            int n=nums.length;
            int cmax=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                    if(nums[i] == 1){
                            c++;
                    }
                    else{
                            if(c>cmax){
                                    cmax=c;
                            }
                            c=0;
                    }
            }
            return c>cmax?c:cmax;
        
    }
}