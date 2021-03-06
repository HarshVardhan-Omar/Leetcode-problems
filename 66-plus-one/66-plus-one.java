class Solution {
    public int[] plusOne(int[] digits) {
        //Only in the case of all digits being 9 will we have to define an array with size 1 more than size of given array
        //So the following block of code is to discern that
        //************************************
        int nines = 0;
        for(int n: digits)
            if(n == 9)
                nines++;
        int[] ans;
        if(nines == digits.length)
            ans = new int[digits.length+1];
        else
            ans = digits.clone();
        //************************************
        
        int len = digits.length-1;

        //Only in case where there is a 9 do we have to increment the number before by 1
        while(len > 0 && digits[len] == 9) {
            ans[len] = 0;
            len--;
        }
        //if not 9 or once 9s have been handled we simply add 1 to the digit before 9
        ans[len] += 1;
        return ans;
    }
}