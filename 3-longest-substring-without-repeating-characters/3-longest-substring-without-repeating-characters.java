class Solution {
        
    private boolean checkcount(HashMap<Character,Integer> mp){
            for(char i:mp.keySet()){
                    if(mp.get(i)>1){
                            return false;
                    }
            }
            return true;
    }
    private boolean ispossible(String s,int mid,int n){
            int i=0;
            int windowsize=mid;
            HashMap<Character,Integer> mp=new HashMap<>();
            while(i<n&&i<windowsize){
                    char key=s.charAt(i);
                    mp.put(key,mp.getOrDefault(key,0)+1);
                    i++;
            }
            if(checkcount(mp)){
                    return true;
            }
            while(i<n){
                    char key=s.charAt(i);
                    char toremove=s.charAt(i-windowsize);
                    mp.put(key,mp.getOrDefault(key,0)+1);
                    mp.replace(toremove,mp.get(toremove)-1);
                    i++;
                    if(checkcount(mp)){
                            return true;
                    }
            }
            return false;
         
    }
    public int lengthOfLongestSubstring(String s) {
            int n=s.length();
            if(n==0){
                    return 0;
            }
            int l=1;
            int e=n;
            int ans=1;
            while(l<=e){
                    int mid=l+(e-l)/2;
                    if(ispossible(s,mid,n)){
                            ans=mid;
                            l=mid+1;
                    }
                    else{
                            e=mid-1;
                    }
            }
            return ans;
        
    }
}