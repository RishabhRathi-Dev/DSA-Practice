class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()){
            if (freq.containsKey(c)){
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        int m = s.length();

        while (sb.length() < s.length()){
            for (Map.Entry e : freq.entrySet()){
                if ((int) e.getValue() == m){
                    for (int i = 0; i < (int) e.getValue(); i++){
                        sb.append((char) e.getKey());
                    }

                    freq.put((char) e.getKey(), -1);
                }
            }

            m--;
        }

        return sb.toString();
    }
}