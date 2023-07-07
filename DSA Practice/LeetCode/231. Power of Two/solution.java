class Solution {
    public boolean isPowerOfTwo(int n) {
        int c = 0;

        if (n <= 0){
            return false;
        }

        while(n > 0){
            if ((n & 1) == 1){
                c++;
            }

            if (c > 1){
                return false;
            }
            n = n >> 1;
            
        }

        return true;
    }
}