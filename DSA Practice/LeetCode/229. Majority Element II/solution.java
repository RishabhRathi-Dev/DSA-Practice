class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int n = nums.length/3;
        for (int i : nums){
            if (m.containsKey(i)){
                m.put(i, m.get(i) + 1);
            } else{
                m.put(i, 1);
            }
        }
        
        List<Integer> ans = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> e : m.entrySet()){
            if ((int) e.getValue() > n){
                ans.add(e.getKey());
            }
        }

        return ans;
    }
}