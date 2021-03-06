class Solution {  
   
   //Function to Check whether a subarray of size mid is valid subarray or not
   private boolean ispossible(int[] nums,int target,int mid){
                int n=nums.length;
                int windowsize=mid;
                int i=0;
                int sum=0;
                while(i<windowsize&&i<n){
                        sum+=nums[i];
                        i++;
                }
                if(sum>=target){
                        return true;
                }
                while(i<n){
                        sum+=nums[i];
                        sum-=nums[i-windowsize];
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
            
            //Binary Search on 0-N as subarray length can vary from 0-N
            while(s<=e){
                    int mid=s+(e-s)/2;
                    if(ispossible(nums,target,mid)){
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