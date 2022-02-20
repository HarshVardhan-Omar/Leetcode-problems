class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                    if(!mp.containsKey(nums[i]))
                            mp.put(target-nums[i],i);
                    else
                            return new int[]{mp.get(nums[i]),i};
            }
            return new int[]{0};
    }
}