class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] domi = dominoes.toCharArray();
        int[] dist = new int[n];
        int f = 0;
        for(int i = 0; i < n; i++){
            if(domi[i] == 'R'){
                f = n;
            }
            else if(domi[i] == 'L'){
                f = 0;
            }
            else{
                f = Math.max(f-1, 0);
            }
            dist[i] += f;
        }
        f = 0;
        for(int i = n-1; i >= 0; i--){
            if(domi[i] == 'L'){
                f = n;
            }
            else if(domi[i] == 'R'){
                f = 0;
            }
            else{
                f = Math.max(f-1, 0);
            }
            dist[i] -= f;
        }
        StringBuilder sb = new StringBuilder();
        for(int ch: dist){
            if(ch>0){
                sb.append("R");
            }
            else if(ch<0){
                sb.append("L");
            }
            else{
                sb.append(".");
            }
        }
        return sb.toString();
    }
}