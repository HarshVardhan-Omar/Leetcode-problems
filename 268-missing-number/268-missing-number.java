class Solution {
    public int missingNumber(int[] nums) {
            int normalxor=0;
            for(int i=0;i<=nums.length;i++){
                    normalxor=normalxor^i;
            }
            int givenxor=0;
            for(int i=0;i<nums.length;i++){
                    givenxor=givenxor^nums[i];
            }
            return givenxor^normalxor;
        
    }
}