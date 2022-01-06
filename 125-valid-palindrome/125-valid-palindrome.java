class Solution {
    private boolean isvalid(char ch){
            if( (ch>='a'&&ch<='z') || (ch>='0'&&ch<='9'))
                    return true;
            return false;
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String newstring="";
        int n=s.length();
        for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                int val=(int)ch;
                if(isvalid(ch)){
                newstring=newstring+ch;
                }
        }
            System.out.print(newstring);
            return ispalindrome(newstring,newstring.length());
        
            
    }
        private boolean ispalindrome(String s,int n){
                int a=0;
                int e=n-1;
                while(a<=e){
                    if(s.charAt(a)!=s.charAt(e))
                            return false;
                    a++;
                    e--;
                 }
                return true;       
        }
}