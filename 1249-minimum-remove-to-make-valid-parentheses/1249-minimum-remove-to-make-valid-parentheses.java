class Solution {
    public String minRemoveToMakeValid(String s) {
            int n=s.length();
            Stack<Pair<Character,Integer>> st=new Stack<>();
            for(int i=0;i<n;i++){
                    char c=s.charAt(i);
                    if(c=='('){
                            st.push(new Pair<>(c,i));
                    }
                    else if(c==')'){
                            if(!st.isEmpty()&&st.peek().getKey()=='('){
                                    st.pop();
                            }
                            else{
                                    st.push(new Pair<>(c,i));
                            }
                    }
            }
            StringBuilder ans=new StringBuilder("");
            Set<Integer> indexremove=new HashSet<>();
            while(!st.isEmpty()){
                    indexremove.add(st.peek().getValue());
                    st.pop();
            }
            for(int i=0;i<n;i++){
                    if(!indexremove.contains(i)){
                            ans.append(s.charAt(i));
                    }
            }
            return ans.toString();
        
    }
}