class Solution {
    public boolean validMountainArray(int[] arr) {
            int n=arr.length;
            if(n<3)
                    return false;
            int i=1;
            while(i<n&&arr[i]>arr[i-1]){
                    i++;
            }
            if(i==1)
                    return false;
            if(i<n){
                    while(i<n&&arr[i-1]>arr[i]){
                            i++;
                    }
                    if(i<n)
                            return false;
            }
            else{
                    return false;
            }
            return true;
        
    }
}