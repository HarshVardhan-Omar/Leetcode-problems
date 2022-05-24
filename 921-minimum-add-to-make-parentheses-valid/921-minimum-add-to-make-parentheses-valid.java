class Solution {
    public int minAddToMakeValid(String s) {
            int n=s.length();
            Stack<Character> st=new Stack<>();
            for(int i=0;i<n;i++){
                    char ch=s.charAt(i);
                    if(ch=='('){
                            st.push(ch);
                    }
                    else{
                            if(!st.isEmpty()&&st.peek()=='('){
                                    st.pop();
                            }
                            else{
                                    st.push(ch);
                            }
                    }
            }
            int ans=0;
            while(!st.isEmpty()){
                    st.pop();
                    ans++;
            }
            return ans;
        
    }
}