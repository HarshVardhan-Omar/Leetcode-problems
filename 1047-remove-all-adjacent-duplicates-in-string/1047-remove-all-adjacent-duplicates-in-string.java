class Solution {
    public String removeDuplicates(String s) {
            int n=s.length();
            Stack<Character> st=new Stack<>();
            for(int i=0;i<n;i++){
                    if(st.size()==0||s.charAt(i)!=st.peek()){
                            st.push(s.charAt(i));
                    }
                    else{
                          st.pop();  
                    }
            }
            StringBuilder str=new StringBuilder();
            while(!st.isEmpty()){
                    str.append(st.pop());
            }
            str=str.reverse();
            String res=str.toString();
            return res;
        
    }
}