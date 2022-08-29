class Solution {
    public boolean isPalindrome(int x) {
            boolean ispalind=ispalind(x);
            return ispalind;
        
    }
        private int reverse(int x){
                int dup=x;int rev=0;
                while(dup!=0){
                        rev=(rev*10)+dup%10;
                        dup=dup/10;
                }
                return rev;
        }
        private boolean ispalind(int x){
                int reverse=reverse(Math.abs(x));
                if(reverse==x)
                        return true;
                else
                        return false;
        }
}