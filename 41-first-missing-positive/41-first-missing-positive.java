class Solution {
    public int firstMissingPositive(int[] nums) {
            int n=nums.length;
            int i=0;
            int ans=0;
            while(i<n){
                    int corindex=nums[i]-1;
                    if(nums[i]>0&&corindex<n){
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
                    if(j+1!=nums[j]){
                            ans=j+1;
                            break;
                    }
            }
            if(ans==0)
                    ans=nums[n-1]+1;
            return ans;
        
    }
}