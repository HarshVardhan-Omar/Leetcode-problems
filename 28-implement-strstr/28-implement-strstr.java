class Solution {
    public int strStr(String haystack, String needle) {
            if(needle.length()==0){
                    return 0;
            }
            if(haystack.length()==0){
                    return -1;
            }
            // boolean ans=haystack.contains(needle);
            
            // System.out.println(ans);
            return haystack.indexOf(needle);
            
            // return -1;
        
    }
}