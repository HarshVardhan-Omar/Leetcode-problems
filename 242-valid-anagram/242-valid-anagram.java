class Solution {
    private boolean checkequal(int[] a,int[] b){
            for(int i=0;i<26;i++){
                    if(a[i]!=b[i])
                            return false;
            }
            return true;
    }
    public boolean isAnagram(String s, String t) {
            int n=t.length();
            int n1=s.length();
            if(n1!=n)
                    return false;
            int[] count1=new int[26];
            int[] count2=new int[26];
            for(int i=0;i<n;i++){
                    count1[t.charAt(i)-'a']++;
            }
            for(int j=0;j<n1;j++){
                    count2[s.charAt(j)-'a']++;
            }
            if(checkequal(count1,count2))
                    return true;
            return false;
    }
}