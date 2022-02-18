class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
            int i=0;
            Stack<Character> st=new Stack<>();
            for(;i<n&&k>0;){
                    while(k>0&&!st.isEmpty()&&num.charAt(i)<st.peek()){
                            st.pop();
                            k--;
                    }
                    st.push(num.charAt(i));
                    i++;
            }
            while(!st.isEmpty()&&k>0){
                    st.pop();
                    k--;
            }
            String ans="";
            while(!st.isEmpty()){
                    ans=st.pop()+ans;
            }
            ans=ans+num.substring(i);
            i=0;
            while(i<ans.length()){
                    if(ans.charAt(i)=='0'){
                            i++;
                    }
                    else{
                            break;
                    }
            }
            return ans.substring(i).length()==0?"0":ans.substring(i);
    }
}