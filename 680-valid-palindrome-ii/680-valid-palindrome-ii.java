class Solution {

public boolean validPalindrome(String s) {
return validSubPalindrome(s, 0, s.length() - 1, false);
}

private boolean validSubPalindrome(String s, int lo, int hi, boolean used) {
if (lo >= hi) {
return true;
}

if (s.charAt(lo) != s.charAt(hi)) {
if (used == false) {
if (validSubPalindrome(s, lo + 1, hi, true)) return true;
return validSubPalindrome(s, lo, hi - 1, true);
} else {
return false;
}
}

return validSubPalindrome(s, lo + 1, hi - 1, used);
}

}