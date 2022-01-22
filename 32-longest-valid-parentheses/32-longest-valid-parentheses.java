class Solution {
    public int longestValidParentheses(String s) {
            int n=s.length();
            int maxans=0;
            int i=0;
            Stack<Integer> st=new Stack<>();
            st.push(-1);
            if(n==0){
                    return 0;
            }
            while(i<n){
                    char ch=s.charAt(i);
                    if(ch=='('){
                          st.push(i);
                          
                    }
                    else{
                            st.pop();
                            if(st.isEmpty()){
                                    st.push(i);
                            }
                            else{
                                    maxans=Math.max(maxans,i-st.peek());
                            }
                    }
                    i++;
            }
            return maxans;
    }
}