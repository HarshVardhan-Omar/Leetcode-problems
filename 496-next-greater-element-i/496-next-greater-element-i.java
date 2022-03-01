class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
            
            for(int val:nums2){
                    while(!st.isEmpty()){
                            if(val>st.peek()){
                                    mp.put(st.peek(),val);
                                    st.pop();
                            }
                            else{
                                    break;
                            }
                    }
                    st.push(val);
            }
            int[] ans=new int[nums1.length];
            int k=0;
            for(int val:nums1){
                    if(mp.containsKey(val)){
                            ans[k++]=mp.get(val);
                    }
                    else{
                            ans[k++]=-1;
                    }
            }
            return ans;
    }
}