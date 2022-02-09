class Solution {
    public int findPairs(int[] nums, int k) {
            int n=nums.length;
            Map<Integer,Integer> mp=new HashMap<>();
            for(int num:nums){
                    mp.put(num,mp.getOrDefault(num,0)+1);
            }
            int c=0;
            for(int num:mp.keySet()){
                    if(k==0&&mp.get(num)>1||k>0&&mp.containsKey(num+k))
                            c++;
            }
            return c;
        
    }
}