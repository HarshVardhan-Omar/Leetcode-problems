class Solution {
    public int rob(int[] nums) {
        int n =  nums.length;
        if(n==1)return nums[0];
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        for(int i=0;i<n-1;i++){
                temp1[i]=nums[i];
        }
            int k=0;
        for(int i=1;i<n;i++){
                temp2[k++]=nums[i];
        }
        // if(nums.length == 2)return Math.max(nums[0],nums[1]);
        return Math.max(findmax(temp1),findmax(temp2));
    }
    private int findmax(int[] nums){
            int n=nums.length;
            int prev=nums[0];
            int prev2=0;
            for(int i=1;i<n;i++){
                    int take=nums[i];
                    if(i > 1)take+=prev2;
                    int notTake=prev;
                    int curi=Math.max(take,notTake);
                    prev2=prev;
                    prev=curi;
                    
            }
            return prev;
            
    }
}