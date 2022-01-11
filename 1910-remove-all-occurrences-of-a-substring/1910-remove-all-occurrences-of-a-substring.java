class Solution {
    public String removeOccurrences(String s, String part) {
        
            int ind=s.indexOf(part);
            while(ind!=-1){
                    s=s.substring(0,ind)+s.substring(ind+part.length());
                    ind=s.indexOf(part);
            }
            return s;
    }
}