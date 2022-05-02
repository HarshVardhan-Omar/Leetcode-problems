class Solution {
    public int[] sortArrayByParity(int[] nums) {
            int n=nums.length;
            int firsteven=0;
            int i=0;
            while(i < n){
                    int ele=nums[i];
                    if(ele%2 ==0){
                            int temp=nums[i];
                            nums[i]=nums[firsteven];
                            nums[firsteven]=temp;
                            firsteven++;
                    }
                    i++;
            }
            return nums;
        
    }
}