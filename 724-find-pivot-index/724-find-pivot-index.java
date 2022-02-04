class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
            int[] prefix=new int[n];
            prefix[0]=nums[0];
            for(int i=1;i<=n-1;i++){
                    prefix[i]=prefix[i-1]+nums[i];
            }
            int i=0;
            int leftsum=0;
            int rightsum=0;
            while(i<n){
                    if(i==0){
                            leftsum=0;
                            rightsum=prefix[n-1]-prefix[i];
                            if(leftsum==rightsum)
                                    return i;
                            i++;
                            continue;
                    }
                    leftsum=prefix[i-1];
                    rightsum=prefix[n-1]-prefix[i];
                    if(leftsum==rightsum)
                            return i;
                    if(i==n-1){
                            leftsum=prefix[i-1];
                            rightsum=0;
                            if(leftsum==rightsum)
                                    return i;
                            i++;
                            continue;
                    }
                    i++;
                    
            }
            return -1;
    }
}