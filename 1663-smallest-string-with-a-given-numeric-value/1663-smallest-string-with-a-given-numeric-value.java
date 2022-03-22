class Solution {
    public String getSmallestString(int n, int k) {
            StringBuilder ans=new StringBuilder("");
            
            for(char ch='z';ch>='a';ch--){
                    int value=ch-'a'+1;
                    // System.out.println(value);
                    while( value<=k && (k-value)>=n-1){
                            // System.out.println("hi");
                            ans.append(ch);
                            n--;
                            k-=value;
                    }
                    
            }
            ans=ans.reverse();
            return ans.toString();
        
    }
}