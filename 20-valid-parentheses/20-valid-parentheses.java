import java.util.*;
class Solution {
    public boolean isValid(String s) {
            boolean ans=checkvalid(s);
            return ans;
        
    }
        boolean checkvalid(String s){
                Stack<Character> stack=new Stack<>();
                for(int i=0;i<s.length();i++){
                        if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                                if(stack.isEmpty()){
                                        return false;
                                }
                                if((s.charAt(i)==')'&&stack.peek()=='(')
                                       ||(s.charAt(i)=='}'&&stack.peek()=='{')
                                       ||(s.charAt(i)==']'&&stack.peek()=='[')){
                                        stack.pop();
                                        // System.out.print(stack);
                                        
                                }
                                else{
                                        return false;
                                }
                        }
                        else{
                                
                                stack.push(s.charAt(i));
                                // System.out.print(stack);
                        }
                }
                if(stack.isEmpty()){
                        return true;
                }
                else{
                        return false;
                        
                }
        }
        
}