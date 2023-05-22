import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[k];

        for (int i : nums){
            if (m.containsKey(i)){
                m.put(i, m.get(i)+1);
            } else {
                m.put(i, 1);
            }
        }

        // Sorting to get rank
        Collection<Integer> valu = m.values();
        ArrayList<Integer> rank = new ArrayList<Integer>(valu);
        Collections.sort(rank, Collections.reverseOrder());
        
        List needed = rank.subList(0, k);
        int pointer = 0;

        for (Map.Entry e : m.entrySet()){
            int val = (int) e.getValue();
            int key = (int) e.getKey();

            if (needed.contains(val)){
                res[pointer] = key;
                pointer++;
            }
        }

        return res;

    }
}