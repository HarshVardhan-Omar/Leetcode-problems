class Solution {
    public int findDuplicate(int[] nums) {
            int length=nums.length;
            for(int i=0;i<length;i++){
                    int number=Math.abs(nums[i]);
                    if(nums[number]>0){
                            nums[number]=0-nums[number];
                    }
                    else{
                            return number;
                    }
            }
            return -1;
        
    }
}