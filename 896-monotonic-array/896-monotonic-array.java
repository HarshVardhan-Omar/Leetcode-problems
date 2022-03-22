class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ifany = false;
        boolean what = false;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1])
              continue;
            if(ifany == true){
                if(nums[i] > nums[i - 1] && what == true)
                    continue;
                else if(nums[i] < nums[i - 1] && what == false)
                    continue;
                else
                    return false;
            }else{
                ifany = true;
                if(nums[i] > nums[i - 1]){
                    what = true;
                }else
                    what = false;
            }
        }
        return true;
    }
}