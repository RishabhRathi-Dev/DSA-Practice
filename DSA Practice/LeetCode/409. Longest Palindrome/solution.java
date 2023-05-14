class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int l = 0;
        for (char c : s.toCharArray()){
            if (m.containsKey(c)){
                m.put(c, m.get(c)+1);
            } else {
                m.put(c, 1);
            }
        }

        for (Map.Entry a : m.entrySet()){
            int v = (int) a.getValue();
            if (v%2 == 0){
                l += v;
            } else {
                l += v - 1;
                m.put((char) a.getKey(), 1);
            }
        }

        int mOdd = 0;
        for (Map.Entry a : m.entrySet()){
            int v = (int) a.getValue();
            if (v%2 != 0){
                mOdd = Math.max(mOdd, v);
            }
        }

        l += mOdd;

        return l;
    }
}