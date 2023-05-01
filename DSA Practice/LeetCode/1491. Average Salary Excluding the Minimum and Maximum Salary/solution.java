class Solution {
    public double average(int[] salary) {
        int ma = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;

        int s = 0;
        int c = 0;

        for (int i : salary){

            if (i > ma){
                ma = i;
            }

            if (i < mi){
                mi = i;
            }
        }

        for (int i : salary){
            if (i == ma | i == mi){
                continue;
            }

            s += i;
            c++;
        }

        return (double)s/(double)c;
    }
}