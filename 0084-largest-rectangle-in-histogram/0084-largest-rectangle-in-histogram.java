class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }

        int n = heights.length;
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        HashMap<Integer, Integer> f = new HashMap<>();
        HashMap<Integer, Integer> b = new HashMap<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek().getKey() >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                f.put(i, -1);
            else
                f.put(i, st.peek().getValue());
            st.push(new Pair<>(heights[i], i));
        }
        
        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek().getKey() >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                b.put(i, n);
            else
                b.put(i, st.peek().getValue());
            st.push(new Pair<>(heights[i], i));
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = b.get(i) - f.get(i) - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}