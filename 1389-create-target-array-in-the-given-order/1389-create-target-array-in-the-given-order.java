class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
            int n=nums.length;
            int[] target=new int[n];
            for(int i=0;i<n;i++)
                    target[i]=-1;
            int i=0;
            while(i<n){
                    if(target[index[i]]==-1){
                            target[index[i]]=nums[i];
                    }
                    else{
                            for(int j=n-1;j>=index[i]+1;j--){
                                    target[j]=target[j-1];
                            }
                            target[index[i]]=nums[i];
                    }
                    i++;
            }
            return target;
        
    }
}