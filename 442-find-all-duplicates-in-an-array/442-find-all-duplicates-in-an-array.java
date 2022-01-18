class Solution {
    public List<Integer> findDuplicates(int[] nums) {
            int n=nums.length;
            int i=0;
            List<Integer> ans=new ArrayList<>();
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
                    if(j+1!=nums[j])
                            ans.add(nums[j]);
            }
            return ans;
        
    }
}