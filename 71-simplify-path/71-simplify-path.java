class Solution {
    public String simplifyPath(String path) {
            Stack<String> st=new Stack<>();
            int n=path.length();
            String[] chars=path.split("\\/");
            for(String p:chars){
                    if(p.length()==0 || p.equals(".")) {
                            continue;
                    }
                    else if(p.equals("..")) {
                            if(!st.isEmpty()){
                                  st.pop();  
                            }
                    }
                    else{
                            st.push(p);
                    }
            }
            String ans="";
            while(!st.isEmpty()){
                    ans=st.pop()+"/"+ans;
            }
            if(ans.length()==0){
                    return "/";
            }
            ans="/"+ans.substring(0,ans.length()-1);
            return ans;
        
    }
}