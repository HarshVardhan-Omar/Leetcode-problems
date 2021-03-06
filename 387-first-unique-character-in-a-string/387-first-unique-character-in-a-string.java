class Solution {
    public int firstUniqChar(String s) {
            int n=s.length();
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                    mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<n;i++){
                    if(mp.get(s.charAt(i))==1){
                            return i;
                    }
            }
            return -1;
        
    }
}