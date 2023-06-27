class Solution {
    public int appendCharacters(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        int tpointer = 0;

        for (char c : schar){
            if (tpointer == tchar.length){
                break;
            }
            if (c == tchar[tpointer]){
                tpointer++;
            }
        }

        return tchar.length - tpointer;
    }
}