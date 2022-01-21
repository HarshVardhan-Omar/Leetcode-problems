class Solution {
    public int threeSumClosest(int[] nums, int target) {
            int n=nums.length;
            Arrays.sort(nums);
            int diffval=0;
            int answer=0;
            int absdiffval=(int)1e9+7;
            boolean f=false;
            for(int i=0;i<n-2;i++){
                    if(i>0&&nums[i-1]==nums[i])
                            continue;
                    int a=nums[i];
                    int start=i+1;
                    int end=n-1;
                    while(start<end)
                    {
                        int s=0;
                     s+=a+nums[start]+nums[end];
                        int d=Math.abs(target-s);
                        if(target-s<0)
                        {
                            
                            if(d<=absdiffval)
                            {
                                absdiffval=d;
                                answer=s;
                        }
                                end--;
                        }
                        if(target-s>0)
                        {
                            d=Math.abs(target-s);
                            if(d<=absdiffval)
                            {
                                absdiffval=d;
                                 answer=s;
                            }
                                start++;
                        }
                                
                         if(target-s==0)
                         {
                             answer=s;
                             f=true;
                             break;
                          }
                    }
                if(f)
                break;
                    
            }
            return answer;
    }
}