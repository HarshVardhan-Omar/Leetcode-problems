class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
            int n=nums.length;
            HashMap<Integer,Integer> mp=new HashMap<>();
            mp.put(0,-1);
            int i=0;int sum=0;
            while(i<n){
                    sum+=nums[i];
                    int key=sum%k;
                    if(mp.containsKey(key)&&i-mp.get(key)>1)
                            return true;
                    else if(!(mp.containsKey(key)))
                            mp.put(key,i);
                    i++;
            }
            return false;
        
    }
}