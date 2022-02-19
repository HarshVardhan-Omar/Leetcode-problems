class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] square=new int[nums.length];
            int l=0;
            int r=nums.length-1;
            int p=r;
            while(l<=r){
                    if(Math.abs(nums[l])>Math.abs(nums[r])){
                            square[p]=nums[l]*nums[l];
                            l++;
                    }
                    else{
                            square[p]=nums[r]*nums[r];
                            r--;
                            
                    }
                    p--;
            }
            return square;
    }
}