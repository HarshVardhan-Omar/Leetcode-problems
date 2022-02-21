class Solution {
    public String reverseWords(String s) {
            int n=s.length();
        int first=0;
        int second=0;
            s+=' ';
            String ans="";
            while(second<n){
                    if(s.charAt(second+1)!=' '){
                            second++;
                    }
                    else{
                            second++;
                            String word=s.substring(first,second);
                            String rev=reverse(word);
                            // System.out.println(word+" "+rev);
                            ans+=rev+" ";
                            first=second+1;
                            second++;
                    }
            }
            ans=ans.trim();
            return ans;
    }
        private String reverse(String word){
                StringBuilder str=new StringBuilder(word);
                str.reverse();
                return str.toString();
        }
}