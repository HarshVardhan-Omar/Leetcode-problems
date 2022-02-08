class Solution {
        private boolean ispossible(int[] nums,int target,int mid){
                int n=nums.length;
                int windowsize=mid;
                int i=0;
                int sum=0;
                while(i<windowsize&&i<n){
                        sum+=nums[i];
                        System.out.println(sum);
                        i++;
                }
                if(sum>=target){
                        return true;
                }
                while(i<n){
                        sum+=nums[i];
                        sum-=nums[i-windowsize];
                        System.out.println(sum);
                        if(sum>=target)
                                return true;
                        i++;
                }
                return false;
        }
    public int minSubArrayLen(int target, int[] nums) {
            int n=nums.length;
            int s=0;
            int e=n;
            int ans=0;
            while(s<=e){
                    int mid=s+(e-s)/2;
                    if(ispossible(nums,target,mid)){
                            // System.out.println("true bheja");
                            ans=mid;
                            e=mid-1;
                    }
                    else{
                            s=mid+1;
                    }
            }
            return ans;
        
    }
}