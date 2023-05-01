class Solution {
    public int fib(int n) {
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            int a = 0;
            int b = 1;

            for (int i = 2; i < n+1; i++){
                int temp = a;
                a = b;
                b = b + temp;
            }

            return b;
        }
    }
}