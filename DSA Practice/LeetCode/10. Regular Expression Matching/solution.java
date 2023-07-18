class Solution {

    private boolean rec(int index, String s, int pindex, String p){
        if (index == s.length() && pindex == p.length()){
            return true;
        }

        if (pindex >= p.length()){
            return false;
        }

        boolean currentMatch = index < s.length() && (s.charAt(index) == p.charAt(pindex) || p.charAt(pindex) == '.');

        if (pindex + 1 < p.length() && p.charAt(pindex + 1) == '*'){
            return (currentMatch && rec(index + 1, s, pindex, p)) || rec(index, s, pindex + 2, p);
        } else {
            return currentMatch && rec(index + 1, s, pindex + 1, p);
        }
    }

    public boolean isMatch(String s, String p) {
        return rec(0, s, 0, p);
    }
}
