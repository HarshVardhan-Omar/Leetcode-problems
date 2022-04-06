class Solution {
    public int threeSumMulti(int[] arr, int target) {
       long[] map = new long[101];
        long tuples = 0L;
        for (int a : arr) {
            map[a]++;
        }
        
        for (int i = 0; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                int k = target - i - j;
                if (k < j || k > 100 || map[i] == 0 || map[j] == 0 || map[k] == 0) {
                    continue;
                }
                if (i == j && j == k) {
                    tuples += (map[i]) * (map[i] - 1) * (map[i] - 2) / 6;
                } else if (i == j) {
                    tuples += map[k] * map[i] * (map[i] - 1) / 2;
                } else if (j == k) {
                    tuples += map[i] * map[j] * (map[j] - 1) / 2;
                } else {
                    tuples += map[i] * map[j] * map[k];
                }
            }
        }
        return (int)(tuples %(1_000_000_007));
    }
}