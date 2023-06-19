class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        if (n < m) minDistance(word2, word1);

        char[] WA1 = word1.toCharArray();
        char[] WA2 = word2.toCharArray();
        
        int[] dpLast = new int[m + 1];
        int[] dpCurr = new int[m + 1];
        
        for (char c1 : WA1) {
            for (int j = 0; j < m; j++) {
                if (c1 == WA2[j]) {
                    dpCurr[j + 1] = dpLast[j] + 1;
                } else {
                    dpCurr[j + 1] = Math.max(dpCurr[j], dpLast[j + 1]);
                }
            }
            /*
            System.out.println(c1);
            System.out.println(Arrays.toString(dpLast));
            System.out.print(Arrays.toString(dpCurr));

            Basically in this we are taking minimum string them calculating the longest common
            substring (In same sequence with string in between possible) then subtracting twice of it from total length to get min removed
            */
            int[] tempArr = dpLast;
            dpLast = dpCurr;
            dpCurr = tempArr;
        }
        
        return n + m - 2 * dpLast[m];
    }
}