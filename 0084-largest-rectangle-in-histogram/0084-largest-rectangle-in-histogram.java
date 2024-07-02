class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        HashMap<Integer, Integer> f = new HashMap<>();
        HashMap<Integer, Integer> b = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            while (!st.empty() && st.peek().getKey() >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                f.put(heights[i], -1);
            else
                f.put(heights[i], st.peek().getValue());
            st.push(new Pair(heights[i], i));
        }
        while (!st.empty()) {
            st.pop();
        }
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek().getKey() >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                b.put(heights[i], heights.length);
            else
                b.put(heights[i], st.peek().getValue());
            st.push(new Pair(heights[i], i));
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, heights[i] * (b.get(heights[i]) - f.get(heights[i]) - 1));
        }
        return max;
    }
}