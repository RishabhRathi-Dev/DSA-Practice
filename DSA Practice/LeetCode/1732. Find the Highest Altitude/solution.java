class Solution {
    public int largestAltitude(int[] gain) {
        int m = 0;
        int s = 0;

        for (int i : gain){
            s += i;
            m = Math.max(m, s);
        }

        return m;
    }
}