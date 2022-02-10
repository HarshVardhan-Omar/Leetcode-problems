class Solution {
    public int repeatedNTimes(int[] nums) {
            int n=nums.length;
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                    mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
            for(int i:mp.keySet()){
                    if(mp.get(i)==n/2){
                            return i;
                    }
            }
            return -1;
        
    }
}