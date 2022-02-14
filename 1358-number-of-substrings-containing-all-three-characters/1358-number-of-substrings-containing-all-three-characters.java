class Solution {
        private boolean isvalid(int[] a){
                for(int i=0;i<3;i++){
                        if(a[i]<1)
                                return false;
                }
                return true;
        }
    public int numberOfSubstrings(String s) {
        int n=s.length();
            int left=0;
            int right=0;
            int ans=0;
            int[] count=new int[3];
            while(right<n&&left<n){
                    count[s.charAt(right)-'a']++;
                    if(isvalid(count)){
                            ans++;
                            ans+=n-1-right;
                            count[s.charAt(left)-'a']--;
                            left++;
                            count[s.charAt(right)-'a']--;
                    }
                    else{
                            right++;
                    }
            }
            return ans;
    }
}