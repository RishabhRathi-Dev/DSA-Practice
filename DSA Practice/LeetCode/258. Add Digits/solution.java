class Solution {
    public int addDigits(int num) {
        while (num > 9){
            int temp = num;
            int s = 0;
            while(temp > 0){
                s += temp%10;
                temp /= 10;
            }

            num = s;
        }

        return num;
        
    }
}