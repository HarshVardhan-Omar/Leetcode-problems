class Solution {
    public char findTheDifference(String s, String t) {
            int n=s.length();
            int n1=t.length();
            System.out.println(n1-n);
            char ans='a';
            int[] frequency=new int[26];
            int[] frequency1=new int[26];
            for(int i=0;i<n;i++){
                    frequency[s.charAt(i)-'a']++;
            }
            for(int i=0;i<n1;i++){
                    frequency1[t.charAt(i)-'a']++;
            }
            // System.out.println(Arrays.toString(frequency));
            // System.out.println(Arrays.toString(frequency1));
            for(int i=0;i<26;i++){
                    if(frequency[i]!=frequency1[i])
                            ans=(char)(i+(int)'a');
            }
            return ans;
            
            
        
    }
}