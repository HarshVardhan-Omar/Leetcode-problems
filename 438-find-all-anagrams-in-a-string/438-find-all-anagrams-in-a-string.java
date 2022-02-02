class Solution {
    private boolean checkequal(int[] count1,int[] count2){
            for(int i=0;i<26;i++){
                    if(count1[i]!=count2[i])
                            return false;  
            }
            return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
            int n=p.length();
            int[] count1=new int[26];
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                    int index=p.charAt(i)-'a';
                    count1[index]++;
            }
            int i=0;
            int windowsize=n;
            int[] count2=new int[26];
            int start=0;
            while(i<windowsize&&i<s.length()){
                    // start=i;
                    int index=s.charAt(i)-'a';
                    count2[index]++;
                    i++;
            }
            if(checkequal(count1,count2))
                    ans.add(start);
            // System.out.println(i);
            start=1;
            while(i<s.length()){
                    // int startindex=i;
                    int index=s.charAt(i)-'a';
                    count2[index]++;
                    char oldchar=s.charAt(i-windowsize);
                    index=oldchar-'a';
                    count2[index]--;
                    // System.out.println(Arrays.toString(count2));
                    
                    if(checkequal(count1,count2))
                            ans.add(start);
                    i++;
                    start++;
            }
            return ans;
            
        
    }
}