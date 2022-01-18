class Solution {
    public int missingNumber(int[] nums) {
            int i=0;
            int n=nums.length;
            while(i<n){
                    int corindex=nums[i];
                    if(corindex<n){
                            if(nums[i]!=nums[corindex]){
                                    int temp=nums[i];
                                    nums[i]=nums[corindex];
                                    nums[corindex]=temp;
                            }
                            else{
                                    i++;
                            }
                    }
                    else{
                            i++;
                    }
            }
            for(int j=0;j<n;j++){
                    if(nums[j]!=j)
                            return j;
            }
            return n;
        
    }
}