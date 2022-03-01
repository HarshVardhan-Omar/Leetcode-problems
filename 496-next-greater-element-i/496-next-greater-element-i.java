class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
            HashMap<Integer,Integer> mp=new HashMap<>();
            
        //Iterating through nums2
            for(int i=0;i<nums2.length;i++){
                    mp.put(nums2[i],i);
            }
            for(int i=0;i<nums1.length;i++){
                    int index=mp.get(nums1[i]);
                    int itr=index+1;
                    boolean flag=true;
                    while(itr<nums2.length){
                            if(nums2[itr]>nums1[i]){
                                    ans[i]=nums2[itr];
                                    flag=false;
                                    break;
                            }
                            itr++;
                    }
                    if(flag){
                            ans[i]=-1;
                    }
            }
            return ans;
            
    }
}