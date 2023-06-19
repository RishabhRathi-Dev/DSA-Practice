class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] people = new int[n];

        for (int[] i : trust){
            people[i[0]-1] = -1;
            people[i[1]-1]++;
        }

        //System.out.println(Arrays.toString(people));

        int res = -1;

        for (int i = 0; i < n; i++){
            if (people[i] == n - 1){
                res = i + 1;
                break;
            }
        }

        return res;
    }
}