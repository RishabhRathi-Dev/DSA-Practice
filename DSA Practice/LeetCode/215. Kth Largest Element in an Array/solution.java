class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue(nums.length, Collections.reverseOrder());
        for(int i : nums){
            heap.offer(i);
        }

        while(k-1 > 0){
            heap.poll();
            k--;
        }

        return heap.peek();

    }
}