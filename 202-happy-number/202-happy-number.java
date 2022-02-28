class Solution {
    public boolean isHappy(int n) {
        while (true) {
            if (n == 1 || n == 7) return true;
            String s = n + "";
            if (s.length() == 1) return false;
            n = 0;
            for (int i = 0; i < s.length(); i++) {
                int c = (int)(s.charAt(i) - '0');
                n += (int)Math.pow(c, 2);
            }
        }
    }
}