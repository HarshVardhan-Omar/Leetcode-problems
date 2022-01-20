class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
            Arrays.sort(nums);
            List<List<Integer>> answer=new ArrayList<>();
        for(int i=0;i<n-3;i++){
                if(i>0&&nums[i]==nums[i-1])
                        continue;
                int a=nums[i];
                for(int j=i+1;j<n-2;j++){
                        if(j>i+1&&nums[j-1]==nums[j])
                                continue;
                        int b=nums[j];
                        int start=j+1;int end=n-1;
                        while(start<end){
                                int sum=a+b+nums[start]+nums[end];
                                if(sum==target){
                                                                answer.add(Arrays.asList(a,b,nums[start],nums[end]));
                                        while(start<end&&nums[start]==nums[start+1])                                            {
                                             start++;   
                                        }
                                        while(start<end&&nums[end]==nums[end-1])                                            {
                                             end--;   
                                        }
                                        start++;
                                        end--;
                                }
                                else if(sum>target){
                                        end--;
                                }
                                else{
                                        start++;
                                }
                        }
                }
        }
            return answer;
            
        
    }
}