class Solution {
    public int[] findErrorNums(int[] nums) {
            int n=nums.length;
            int i=0;
            int[] ans=new int[2];
            while(i<n){
                    int corindex=nums[i]-1;
                    if(nums[i]!=nums[corindex]){
                            int temp=nums[i];
                            nums[i]=nums[corindex];
                            nums[corindex]=temp;
                    }
                    else{
                            i++;
                    }
            }
            for(int j=0;j<n;j++){
                    if(j+1!=nums[j]){
                            ans[0]=nums[j];
                            ans[1]=j+1;
                    }
                            
            }
            return ans;
        
    }
}