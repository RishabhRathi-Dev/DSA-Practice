class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDegree = new int[n];

        for (List dir : edges){
            inDegree[(int)dir.get(1)]++;
        }

        List<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            if (inDegree[i] == 0){
                res.add(i);
            }
        }

        return res;
    }
}