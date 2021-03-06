class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=binarysearch(nums,target);
        return index;
        
    }
    int binarysearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end+1;
    }
}