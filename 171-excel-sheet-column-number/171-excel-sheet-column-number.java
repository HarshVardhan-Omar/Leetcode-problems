class Solution {
    public int titleToNumber(String s) {
            int ans=0;
            int fact=1;
            HashMap<Character,Integer> mp=new HashMap<>();
            int k=1;
            for(char ch='A';ch<='Z';ch++){
                    mp.put(ch,k++);
            }
            for(int i=s.length()-1;i>=0;i--){
                    ans+=fact*mp.get(s.charAt(i));
                    fact=fact*26;
            }
            return ans;
    }
}