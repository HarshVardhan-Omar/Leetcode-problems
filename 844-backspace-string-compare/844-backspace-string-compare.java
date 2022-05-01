class Solution {
    public boolean backspaceCompare(String s, String t) {
            Stack<Character> st1=new Stack<>();
            Stack<Character> st2=new Stack<>();
            
            int n=s.length();
            int n1=t.length();
            for(int i=0;i<n;i++){
                    char ch=s.charAt(i);
                    if(ch != '#'){
                            st1.push(ch);
                    }
                    else{
                            if(!st1.isEmpty()){
                                    st1.pop();
                            }
                    }
            }
            for(int i=0;i<n1;i++){
                    char ch=t.charAt(i);
                    if(ch != '#'){
                            st2.push(ch);
                    }
                    else{
                            if(!st2.isEmpty()){
                                    st2.pop();
                            }
                    }
            }
            if(st1.isEmpty() && st2.isEmpty()){
                    return true;
            }
            else{
            while(!st1.isEmpty() && !st2.isEmpty()){
                    if(st1.pop() != st2.pop()){
                            return false;
                    }
            }
            }
            return !st1.isEmpty() || !st2.isEmpty()?false:true;
    }
}