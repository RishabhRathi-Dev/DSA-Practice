class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue(matrix.length * matrix[0].length);
        for(int[] i : matrix){
            for (int j : i){
                heap.offer(j);
            }
        }

        while(k-1 > 0){
            heap.poll();
            k--;
        }

        return heap.peek();
    }
}