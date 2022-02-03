class Solution {
    public int lengthOfLastWord(String s) {
            s=s.trim();
            int index=s.lastIndexOf(' ');
            String lastword=s.substring(index+1);
            // System.out.println(lastword);
            return lastword.length();
        
    }
}