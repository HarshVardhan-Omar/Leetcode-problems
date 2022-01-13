class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
            int n=nums.length;
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                    boolean sorted=true;
                    for(int j=0;j<n-1-i;j++){
                            if(nums[j+1]<nums[j]){
                                    int temp=nums[j];
                                    nums[j]=nums[j+1];
                                    nums[j+1]=temp;
                                    sorted =false;
                            }
                            
                    }
                    if(sorted)
                       break;
            }
            
            for(int i=0;i<n;i++){
                    // System.out.print(nums+" ");
                    if(nums[i]==target){
                            ans.add(i);
                    }
            }
            return ans;
        
    }
}