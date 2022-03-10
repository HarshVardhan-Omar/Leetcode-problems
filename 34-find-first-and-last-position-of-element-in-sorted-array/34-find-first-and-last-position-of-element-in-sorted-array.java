class Solution {
    public int[] searchRange(int[] nums, int target) {
            
            int[] ans={-1,-1};
            int first=occurence(nums,target,true);
            int second=occurence(nums,target,false);
            if(first!=-1&&second!=-1){
                    ans[0]=first;
                    ans[1]=second;
            }
            return ans;
            
            
        
    }
        private int occurence(int[] nums,int target,boolean isfirst){
                int n=nums.length;
                int low=0,high=n-1;
                int ans=-1;
            
            while(low<=high){
                    int mid=low+(high-low)/2;
                    if(nums[mid]<target){
                            low=mid+1;    
                    }
                    else if(nums[mid]>target){
                            high=mid-1;
                    }
                    else{
                            ans=mid;
                          if(isfirst){
                                  high=mid-1;
                          }  
                            else{
                                   low=mid+1; 
                            }
                    }
                    
                    
            }
                return ans;
                
        }
}