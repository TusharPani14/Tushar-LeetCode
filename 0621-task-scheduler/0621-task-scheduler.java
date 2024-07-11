class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Step 1: Count the frequency of each task
        Map<Character, Integer> count = new HashMap<>();
        for (char task : tasks) {
            count.put(task, count.getOrDefault(task, 0) + 1);
        }

        // Step 2: Use a max heap to store tasks sorted by their frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(count.entrySet());

        int ans = 0;

        // Step 3: Simulate the process
        while (!maxHeap.isEmpty()) {
            int i = 0;
            List<Map.Entry<Character, Integer>> tempList = new ArrayList<>();
            while (i <= n) {
                if (!maxHeap.isEmpty()) {
                    Map.Entry<Character, Integer> current = maxHeap.poll();
                    current.setValue(current.getValue() - 1);
                    if (current.getValue() > 0) {
                        tempList.add(current);
                    }
                }
                ans++;
                if (maxHeap.isEmpty() && tempList.isEmpty()) {
                    break;
                }
                i++;
            }
            maxHeap.addAll(tempList);
        }

        return ans;
    }
}