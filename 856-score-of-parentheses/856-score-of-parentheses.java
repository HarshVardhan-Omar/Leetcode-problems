class Solution {
    public int scoreOfParentheses(String s) {
            int n=s.length();
            Stack<String> st=new Stack<>();
            for(int i=0;i<n;i++){
                    char c=s.charAt(i);
                    if(c=='('){
                            st.push("(");
                    }
                    else{
                            int innerscore=0;
                            while(!st.isEmpty()&&!st.peek().equals("(")){
                                    innerscore+=Integer.valueOf(st.peek());
                                    st.pop();
                            }
                            st.pop();
                            if(innerscore==0){
                                    st.push("1");
                            }
                            else{
                                    st.push(2*innerscore+"");
                            }
                    }
            }
            int score=0;
            while(!st.isEmpty()){
                    score+=Integer.valueOf(st.peek());
                    st.pop();
            }
            return score;
        
    }
}