class Solution {
    public String frequencySort(String s) {
        //Priority Queue will store elems in sorted order
        //But we need sorted by map values.
        //For that we can write custom comparator function
        Map<Character, Integer> mp = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }
        pq.addAll(mp.entrySet());
        String res = "";
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> top = pq.poll();
            for (int i = 0; i < top.getValue(); i++) {
                res += top.getKey();
            }
        }
        return res;
    }
}