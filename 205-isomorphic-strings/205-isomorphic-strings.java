class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> hash_s = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hash_t = new HashMap<Character, Integer>();
        
        if(s.length() == 1){
            return true;
        }
        
        String s_code = " ";
        String t_code = " ";
        
        for(int i = 0; i < s.length(); i++){
            hash_s.putIfAbsent(s.charAt(i), i);
            hash_t.putIfAbsent(t.charAt(i), i);
            s_code += hash_s.get(s.charAt(i)) + " ";
            t_code += hash_t.get(t.charAt(i)) + " ";

        }
        
        return s_code.equals(t_code);
    }
}