class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                idx = i - 1;
                break;
            }
        }
        
        reverse(nums, idx + 1);
        if (idx == -1) {
            return;
        }
        for (int i = idx + 1; i < nums.length; i++) {
            if (nums[i] > nums[idx]) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                return;
            }
        }
        return;
    }
    
    private void reverse(int[] nums, int start) {
        int l = start, r = nums.length - 1;
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        return;
    }
}