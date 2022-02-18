class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
            if(digits.length()==0)
                    return ans;
        String output="";
            String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            solve(digits,output,0,ans,mapping);
            return ans;
    }
        private void solve(String digits,String output,int i,List<String> ans,String[] mapping){
                if(i==digits.length()){
                        ans.add(new String(output));
                        return;
                }
                int index=digits.charAt(i)-'0';
                String mapped=mapping[index];
                for(int j=0;j<mapped.length();j++){
                        output+=mapped.charAt(j);
                        solve(digits,output,i+1,ans,mapping);
                        output=output.substring(0,output.length()-1);
                }
        }
}