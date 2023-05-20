class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7){
            return true;
        }
        
        while(n > 1){
            int temp = n;
            int ne = 0;
            while(temp > 0){
                int rem = temp % 10;
                ne += rem * rem;
                temp /= 10;
            }

            n = ne;

            if (n == 1 || n == 7){
                return true;
            } else if (n < 10){
                return false;
            }

        }

        return false;
    }
}