class Solution {
    public boolean isPowerOfThree(int n) {
          return rec(n);
    }

    private boolean rec(int n){
        if (n == 1){
            return true;
        } else if (n < 1){
            return false;
        }

        if (n%3 == 0){
            return rec(n/3);
        } else {
            return false;
        }
    } 
}