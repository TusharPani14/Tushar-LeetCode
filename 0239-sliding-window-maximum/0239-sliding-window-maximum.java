class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int ri = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!d.isEmpty() && d.peek() == i - k) {
                d.pop();
            }
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }
            d.addLast(i);
            if (i >= k - 1) {
                res[ri++] = nums[d.peek()];
            }
        }
        return res;
    }
}