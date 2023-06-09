class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i : nums){
            if (m.containsKey(i)){
                m.put(i, m.get(i)+1);
            } else {
                m.put(i, 1);
            }
        }

        int[] res = new int[2];
        int index = 0;
        for (Map.Entry i : m.entrySet()){
            if ((int) i.getValue() == 1){
                res[index] = (int) i.getKey();
                index++;
            }
        }

        return res;
    }
}