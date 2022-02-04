class Solution {
    public int findMaxLength(int[] nums) {
            int n=nums.length;
         HashMap<Integer,Integer> mp=new HashMap<>();
         int length=0;
         int prefix=0;
         mp.put(0,-1);
            int i=0;
            while(i<n){
                    if(nums[i]==0)
                            prefix--;
                    else
                            prefix++;
                    if(mp.containsKey(prefix)){
                            length=Math.max(length,i-mp.get(prefix));
                    }
                    else
                            mp.put(prefix,i);
                    i++;
            }
            return length;
    }
}