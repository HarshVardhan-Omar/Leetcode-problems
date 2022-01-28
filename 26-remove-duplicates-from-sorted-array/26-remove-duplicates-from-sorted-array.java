class Solution {
    public int removeDuplicates(int[] nums) {
            int n=nums.length;
            int i=1;
            int c=0;
            int temp=n;
            while(i<n){
                    while(nums[i]==nums[i-1]){
                            c++;
                            for(int j=i;j<=n-2;j++){
                                    nums[j]=nums[j+1];
                            }
                            if(i==n-1)
                                    break;
                            n--;
                    }
                    i++;
            }
            return temp-c;
        
    }
}