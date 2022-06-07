import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          int temp = 0;
          int count = 0;
          int j =m;
          for(int k = 0; k< nums2.length; k++){
                nums1[j] = nums2[k];
                j++;
          }
          Arrays.sort(nums1);
          
    }
}