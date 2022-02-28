class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
            if(s.length()==0)return ans;
            
            permute(s.toCharArray(),0,ans);
            return ans;
    }
    private void permute(char[] s,int i,List<String> ans){
            if(i==s.length){
                    ans.add(new String(s));
                    return;
            }
            
            if(Character.isDigit(s[i])){
                    permute(s,i+1,ans);
                    // return;
            }
            else{
                    s[i]=Character.toLowerCase(s[i]);
                    permute(s,i+1,ans);
                    
                    s[i]=Character.toUpperCase(s[i]);
                    permute(s,i+1,ans);
            }
    }
}