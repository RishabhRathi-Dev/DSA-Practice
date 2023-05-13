class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();

        if (s.length() != t.length()){
            return false;
        }

        for (char c : s.toCharArray()){
            if (m.containsKey(c)){
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }

        for (char c : t.toCharArray()){
            if (m.containsKey(c)){
                if (m.get(c) > 0){
                    m.put(c, m.get(c) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}