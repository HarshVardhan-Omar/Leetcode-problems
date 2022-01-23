class Solution {
    public List<Integer> findLonely(int[] nums) {
            int n=nums.length;
            Arrays.sort(nums);
            List<Integer> answer=new ArrayList<>();
            if(n==1){
                    answer.add(nums[0]);
                    return answer;
            }
            for(int i=0;i<n;i++){
                    if(i==0){
                            if(!(nums[i+1]-1==nums[i]||nums[i+1]==nums[i])){
                                    answer.add(nums[i]);
                            }
                    }
                    else if(i==n-1){
                            if(!(nums[i-1]==nums[i]||nums[i-1]+1==nums[i])){
                                    answer.add(nums[i]);
                            }
                    }
                    else if(!(nums[i+1]==nums[i]||nums[i-1]==nums[i]||(nums[i-1]+1==nums[i]||nums[i+1]-1==nums[i]))){
                            answer.add(nums[i]);
                            
                    }
                    
                    
            }
            return answer;
        
    }
}