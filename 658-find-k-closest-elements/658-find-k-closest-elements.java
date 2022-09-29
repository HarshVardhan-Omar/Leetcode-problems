class Solution {
        //Runtime: 4 ms, faster than 94.54% of Java online submissions for Find K Closest Elements.
    //Memory Usage: 44.1 MB, less than 95.57% of Java online submissions for Find K Closest Elements.
    //Slide window : (two pointers shrink to K)
    //Time: O(N); Space: O(1)
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> res = new LinkedList<>();
        int left = 0, right = arr.length - 1;

        while (right - left > k - 1){
            //shrink the window size from N to K
            if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x))
                right--;
            else left++;
        }
        while (left <= right) res.add(arr[left++]);
        return res;
    }
}