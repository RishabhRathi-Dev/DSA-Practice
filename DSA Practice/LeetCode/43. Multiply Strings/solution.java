class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        int[] results = new int[m + n];

        for (int i = m - 1; i > -1; i--){

            for (int j = n - 1; j > -1; j--){

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int positionOfResult = i + j + 1; // position of result of base
                int positionOfCarry = i + j; // position of carry
                
                int trueMul = mul + results[positionOfResult]; // adding carry present at the result location

                results[positionOfResult] = trueMul % 10; // setting result
                results[positionOfCarry] += trueMul / 10; // setting carry

            }
        }

        //System.out.println(Arrays.toString(results));

        StringBuilder sb = new StringBuilder();

        for (int i : results){
            // This will make sure that no leading 0s are there like 
            // if the sb does not have any digit other than 0 it will not append
            if (!(sb.length() == 0 && i == 0)){
                sb.append(i);
            }
        }

        if (sb.length() == 0){
            return "0";
        } else {
            return sb.toString();
        }
    }
}