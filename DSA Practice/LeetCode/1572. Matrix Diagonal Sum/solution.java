class Solution {
    public int diagonalSum(int[][] mat) {
        int s = 0;
        int f = 0;
        int b = mat[0].length - 1;

        for (int[] i : mat){
            s += i[f];
            i[f] = 0;

            s += i[b];
            i[b] = 0;

            f++;
            b--;
        }

        return s;
    }
}