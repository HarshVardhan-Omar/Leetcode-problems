class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
            int s=0;
            int e=n-1;
            while(s<e){
                    int sum=numbers[s]+numbers[e];
                    if(sum==target)
                            return new int[]{s+1,e+1};
                    else if(sum<target)
                            s++;
                    else
                            e--;
            }
            return new int[]{0};
            
    }
}