class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
            int diff=0;
            int prev_diff=0;
            for(int i=0;i<arr.length-1;i++){
                    diff=arr[i+1]-arr[i];
                    if(prev_diff==0||prev_diff==diff){
                            prev_diff=diff;
                    }
                    else{
                            return false;
                    }
            }
            return true;
    }
}