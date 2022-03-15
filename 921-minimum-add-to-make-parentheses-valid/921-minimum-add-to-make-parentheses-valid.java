class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
            int ans=0;
            Stack<Character> st=new Stack<>();
            for(int i=0;i<n;i++){
                    char c=s.charAt(i);
                    if(c==')'){
                            if(!st.isEmpty()&&st.peek()=='('){
                                    st.pop();
                            }
                            else{
                                    st.push(c);
                            }
                    }
                    else{
                            st.push(c);
                    }
            }
            while(!st.isEmpty()){
                    st.pop();
                    ans++;
            }
            return ans;
    }
}