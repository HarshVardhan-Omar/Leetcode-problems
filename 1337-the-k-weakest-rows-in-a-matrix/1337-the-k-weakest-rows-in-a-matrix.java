class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        PriorityQueue<Integer> pQ = new PriorityQueue();
        TreeMap<Integer, List<Integer>> map = new TreeMap();
        for (int r = 0; r < n; r++){
            int val = sum(mat[r]);
            List<Integer> lis = map.getOrDefault(val, new ArrayList());
            lis.add(r);
            map.put(val, lis);
            pQ.add(val);
        }
        int[] ans = new int[k];
        int i = 0;
        while (i < k) {
            List<Integer> lis = map.getOrDefault(pQ.peek(), new ArrayList());
            for (int j = 0; j < lis.size(); j++) {
                ans[i++] = lis.get(j);
                if (i == k){
                    break;
                }
            }
            if (lis.size() != 0)
                map.remove(pQ.poll());
            else 
                pQ.poll();
        }
        return ans;
    }
    private int sum (int[] arr){
        int ans = 0;
        for (int n: arr) if (n == 1) ans++;
        return ans;
    }
}