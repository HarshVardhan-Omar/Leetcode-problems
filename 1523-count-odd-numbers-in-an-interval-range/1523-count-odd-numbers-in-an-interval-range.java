class Solution {
    public int countOdds(int low, int high) {
        int nos=(high-low)+1;
        if(nos%2==0)
                return nos/2;
        return low%2==0?nos/2:nos/2+1;
    }
}