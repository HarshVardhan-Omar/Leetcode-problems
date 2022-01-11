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
            // StringBuilder str=new StringBuilder();
            String str="";
            while(!st.isEmpty()){
                   str=str+st.pop();
            }
            String res="";
            for(int i=str.length()-1;i>=0;i--){
                    res=res+str.charAt(i);
                    
            }
            // String res=str.toString();
            return res;
        
    }
}