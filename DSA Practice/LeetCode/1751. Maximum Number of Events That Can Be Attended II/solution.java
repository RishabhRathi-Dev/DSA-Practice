class Solution {
    private int rec(int end, int index, int[][] events, int k, int n, Map<String, Integer> cache){

        if (k == 0 || index == n){
            return 0;
        }

        String key = k + "_" + end;
        Integer val = cache.get(key);

        if (val != null){
            return val;
        }

        int estart = events[index][0];
        int eend = events[index][1];
        int evalue = events[index][2];

        if (estart <= end){
            return rec(end, index+1, events, k, n, cache);
        }

        int attend = evalue + rec(eend, index+1, events, k - 1, n, cache);
        int skip = rec(end, index+1, events, k, n, cache);

        int max = Math.max(attend, skip);

        cache.put(key,max);
        return max;
    }
    
    public int maxValue(int[][] events, int k) {

        int n = events.length;

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        Map<String, Integer> cache = new HashMap<>();

        return rec(0, 0, events, k, n, cache);
    }
}