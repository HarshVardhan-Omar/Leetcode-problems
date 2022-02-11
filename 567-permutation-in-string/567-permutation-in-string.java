class Solution {
    private boolean isequal(int[] a,int[] b){
            for(int i=0;i<26;i++){
                    if(a[i]!=b[i])
                            return false;
            }
            return true;
    }
    public boolean checkInclusion(String s1, String s2) {
            int n1=s1.length();
            int n2=s2.length();
            int[] count1=new int[26];
            int[] count2=new int[26];
            for(int i=0;i<n1;i++){
                    count1[s1.charAt(i)-'a']++;
            }
            int windowsize=n1;
            int i=0;
            while(i<n2&&i<windowsize){
                    count2[s2.charAt(i)-'a']++;
                    i++;
            }
            if(isequal(count1,count2)){
                    return true;
            }
            while(i<n2){
                    count2[s2.charAt(i)-'a']++;
                    char index=s2.charAt(i-windowsize);
                    count2[index-'a']--;
                    if(isequal(count1,count2)){
                            return true;
                    }
                    i++;
            }
            return false;
        
    }
}