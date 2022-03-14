class Solution {
    public int maxArea(int[] height) {
            int n=height.length;
            int start=0;
            int end=n-1;
            int maxwater=Integer.MIN_VALUE;
            int containerwater=0;
            while(start<end){
                    if(height[start]<=height[end]){
                            containerwater=height[start]*(end-start);
                            if(containerwater>maxwater){
                                    maxwater=containerwater;
                            }
                            start++;
                    }
                    else if(height[start]>height[end]){
                            containerwater=height[end]*(end-start);
                            if(containerwater>maxwater){
                                    maxwater=containerwater;
                            }
                            end--;
                    }
            }
            return maxwater;
        
    }
}