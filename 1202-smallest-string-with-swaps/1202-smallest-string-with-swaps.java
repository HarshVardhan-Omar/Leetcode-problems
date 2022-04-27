class Solution {
    int[] parent;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        parent = new int[n];
        StringBuilder sb = new StringBuilder(n);
        // initially consider all nodes as individual / separate nodes and to denote that we are having the same value
        // as the parent node
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
        // create a union b/w all the pairs using Conventional Disjoint method i.e having the immediate parent node as
        // the parent node instead of the root node
        for (List<Integer> pair : pairs) {
            union(pair.get(0), pair.get(1));
        }
        // Since, all the parent nodes draw down to the root node, we will be having a priority queue for each root
        // node. so that in each iteration, we will take the smallest lexicographic character from the PQ and append
        // it to the resultant string for that particular index
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int x = find(i);
            map.putIfAbsent(x, new PriorityQueue<>());
            map.get(x).offer(s.charAt(i));
        }
        // Now, finally after all the processing, for each index find the root index via the find method and poll the
        // corresponding character from it's index and append it to the result
        for (int i = 0; i < n; ++i) {
            sb.append(map.get(find(i)).poll());
        }
        
        return sb.toString();
    }
    
    private int find(int x) {
        while (parent[x] != x) {
            x = parent[x];
        }
        return x;
    }
    
    private void union(int x, int y) {
        int xParent = find(x);
        int yParent = find(y);
        if (xParent < yParent) {
            parent[yParent] = xParent;
        } else {
            parent[xParent] = yParent;
        }
    }
}