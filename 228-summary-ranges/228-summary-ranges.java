class Solution {
    public List<String> summaryRanges(int[] nums) {
            int n=nums.length;
            List<String> ans=new ArrayList<>();
            int slow=0;
            int fast=0;
            String output;
            while(fast<n){
                    output="";
                    if(fast+1<n&&nums[fast+1]-1==nums[fast]){
                            fast++;
                    }
                    else{
                            if(fast!=slow){
                                    output+=nums[slow]+"->"+nums[fast];
                                    ans.add(output);
                                    fast++;
                                    slow=fast;
                            }
                            else{
                                    output+=nums[fast];
                                    ans.add(output);
                                    fast++;
                                    slow=fast;
                            }
                    }
                    
            }
            return ans;
    }
}