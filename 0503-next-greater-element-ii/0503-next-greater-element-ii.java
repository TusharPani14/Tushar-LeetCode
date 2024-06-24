class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums.length];
        
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }
        
        int n = nums.length;
        
        for (int i = 0; i < 2 * n; i++) {
            while (!s.isEmpty() && nums[s.peek()] < nums[i % n]) {
                res[s.pop()] = nums[i % n];
            }
            if (i < n) {
                s.push(i);
            }
        }
        
        return res;
    }
}